package org.academiadecodigo.alphabeat.services.mock;

import org.academiadecodigo.alphabeat.persistence.daos.mock.MockDonorDao;
import org.academiadecodigo.alphabeat.persistence.model.Donor;
import org.academiadecodigo.alphabeat.services.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
@Service
public class MockDonorService extends AbstractMockService<Donor> implements DonorService{

    private MockDonorDao donorDao;


    @Override
    public Donor getDonor(Integer id) {
        return donorDao.findById(id);
    }

    @Override
    public Donor addDonor(Donor donor) {
        return donorDao.saveOrUpdate(donor);
    }

    @Override
    public void deleteDonor(Integer id) {
        donorDao.delete(id);
    }

    @Override
    public List<Donor> listDonors() {
        return donorDao.findAll();
    }

    @Override
    public void addReview(String review, Integer donorIr, Integer suckerId) {
        donorDao.findById(donorIr).addReview(review, suckerId);
    }

    @Override
    public Map<String, Integer> showReviews(Integer donorId) {
        return donorDao.findById(donorId).getReviews();
    }

    @Override
    public void addRating(Integer donorId, Integer rating) {
        donorDao.findById(donorId).addRating(rating);
    }

    @Override
    public double calculateRating(Integer donorId) {
        List<Integer> ratings = donorDao.findById(donorId).getRatings();

        Integer sum = 0;

        if(!ratings.isEmpty()) {
            for (Integer rating : ratings) {
                sum += rating;
            }
            return sum.doubleValue() / ratings.size();
        }

        return sum;
    }

    @Autowired
    public void setDonorDao(MockDonorDao donorDao) {
        this.donorDao = donorDao;
    }
}
