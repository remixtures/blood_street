package org.academiadecodigo.alphabeat.services.mock;

import org.academiadecodigo.alphabeat.model.Donor;
import org.academiadecodigo.alphabeat.model.Sucker;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
@Service
public class MockSuckerService extends AbstractMockService<Sucker> implements SuckerService{

    private MockDonorService donorService;


    @Override
    public Sucker getSucker(Integer id) {
        return modelMap.get(id);
    }

    @Override
    public Sucker addSucker(Sucker sucker) {
        return modelMap.put(getNextId(), sucker);
    }

    @Override
    public void deleteSucker(Integer id) {
        modelMap.remove(id);
    }

    @Override
    public List<Sucker> listSuckers() {
        return new ArrayList<>(modelMap.values());
    }

    @Override
    public String writeReview(Integer donorId) {
        return null;
    }

    @Override
    public Integer addRating(Integer id) {
        Sucker sucker = modelMap.get(id);
        sucker.addRating();
        return sucker.getNumberOfRatings();
    }

    @Override
    public String registerFavoriteBloodType(Integer id, String bloodType) {
        Sucker sucker = modelMap.get(id);
        sucker.setFavBloodType(bloodType);
        return sucker.getFavBloodType();
    }

    @Override
    public void addFavoriteDonor(Integer suckerId, Integer donorId) {
        modelMap.get(suckerId).addFavoriteDonor(donorService.getDonor(donorId));
    }

    @Override
    public void deleteFavoriteDonor(Integer suckerId, Integer donorId) {
        modelMap.get(suckerId).removeFavoriteDonor(donorService.getDonor(donorId));
    }

    @Override
    public List<Donor> listFavoriteDonors(Integer id) {
        return modelMap.get(id).getFavoriteDonors();
    }

    public void setDonorService(MockDonorService donorService) {
        this.donorService = donorService;
    }
}
