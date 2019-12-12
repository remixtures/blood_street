package org.academiadecodigo.alphabeat.services;

import org.academiadecodigo.alphabeat.model.Donor;

import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public interface DonorService {

    Donor getDonor(Integer id);

    Donor addDonor();

    void deleteDonor(Integer id);

    List<Donor> listDonors();

    void addReview(String review);

    void addRating(Integer rating);

    double calculateRating();

    











}
