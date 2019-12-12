package org.academiadecodigo.alphabeat.services.mock;

import org.academiadecodigo.alphabeat.model.Donor;
import org.academiadecodigo.alphabeat.services.DonorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
public class MockDonorService extends AbstractMockService<Donor> implements DonorService{


    @Override
    public Donor getDonor(Integer id) {
        return modelMap.get(id);
    }

    @Override
    public Donor addDonor(Donor donor) {
        return modelMap.put(getNextId(), donor);
    }

    @Override
    public void deleteDonor(Integer id) {
        modelMap.remove(id);
    }

    @Override
    public List<Donor> listDonors() {
        return new ArrayList<>(modelMap.values());
    }

    @Override
    public void addReview(String review, Integer donorIr, Integer suckerId) {
        modelMap.get(donorIr).addReview(review, suckerId);
    }

    @Override
    public Map<String, Integer> showReviews(Integer donorId) {
        return modelMap.get(donorId).getReviews();
    }

    @Override
    public void addRating(Integer donorId, Integer rating) {
        modelMap.get(donorId).addRating(rating);
    }

    @Override
    public double calculateRating(Integer donorId) {
        List<Integer> ratings = modelMap.get(donorId).getRatings();

        Integer sum = 0;

        if(!ratings.isEmpty()) {
            for (Integer rating : ratings) {
                sum += rating;
            }
            return sum.doubleValue() / ratings.size();
        }

        return sum;
    }
}
