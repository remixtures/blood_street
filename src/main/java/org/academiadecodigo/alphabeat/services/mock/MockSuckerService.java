package org.academiadecodigo.alphabeat.services.mock;

import org.academiadecodigo.alphabeat.persistence.daos.mock.MockSuckerDao;
import org.academiadecodigo.alphabeat.persistence.model.Donor;
import org.academiadecodigo.alphabeat.persistence.model.Sucker;
import org.academiadecodigo.alphabeat.persistence.model.choices.BloodType;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
@Service
public class MockSuckerService extends AbstractMockService<Sucker> implements SuckerService{

    private MockDonorService donorService;
    private MockSuckerDao suckerDao;


    @Override
    public Sucker getSucker(Integer id) {
        return suckerDao.findById(id);
    }

    @Override
    public Sucker addSucker(Sucker sucker) {
        return suckerDao.saveOrUpdate(sucker);
    }

    @Override
    public void deleteSucker(Integer id) {
        suckerDao.delete(id);
    }

    @Override
    public List<Sucker> listSuckers() {
        return suckerDao.findAll();
    }

    @Override
    public String writeReview(Integer donorId) {
        return null;
    }

    @Override
    public Integer addRating(Integer id) {
        Sucker sucker = suckerDao.findById(id);
        sucker.addRating();
        return sucker.getNumberOfRatings();
    }

    @Override
    public BloodType registerFavoriteBloodType(Integer id, BloodType bloodType) {
        Sucker sucker = suckerDao.findById(id);
        sucker.setFavBloodType(bloodType);
        return sucker.getFavBloodType();
    }

    @Override
    public void addFavoriteDonor(Integer suckerId, Integer donorId) {
        suckerDao.findById(suckerId).addFavoriteDonor(donorService.getDonor(donorId));
    }

    @Override
    public void deleteFavoriteDonor(Integer suckerId, Integer donorId) {
        suckerDao.findById(suckerId).removeFavoriteDonor(donorService.getDonor(donorId));
    }

    @Override
    public List<Donor> listFavoriteDonors(Integer id) {
        return suckerDao.findById(id).getFavoriteDonors();
    }

    @Autowired
    public void setDonorService(MockDonorService donorService) {
        this.donorService = donorService;
    }

    @Autowired
    public void setSuckerDao(MockSuckerDao suckerDao) {
        this.suckerDao = suckerDao;
    }
}
