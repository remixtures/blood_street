package org.academiadecodigo.alphabeat.services;

import org.academiadecodigo.alphabeat.persistence.model.Donor;

import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
public interface DonorService {

    Donor getDonor(Integer id);

    Donor addDonor(Donor donor);

    void deleteDonor(Integer id);

    List<Donor> listDonors();

    void addReview(String review, Integer donorId, Integer suckerId);

    Map <String, Integer> showReviews(Integer donorId);

    void addRating(Integer donorId, Integer rating);

    double calculateRating(Integer donorId);













}
