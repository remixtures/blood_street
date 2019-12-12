package org.academiadecodigo.alphabeat.services;

import org.academiadecodigo.alphabeat.model.Donor;
import org.academiadecodigo.alphabeat.model.Sucker;

import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public interface SuckerService {

    Sucker getSucker(Integer id);

    Sucker addSucker();

    void deleteSucker(Integer id);

    List<Sucker> listSuckers();

    String writeReview(Integer donorId);

    Integer addRating(Integer id, Integer rating);

    String registerFavoriteBloodType();

    void addFavoriteDonor(Integer id);

    void deleteFavoriteDonor(Integer id);

    List<Donor> listFavoriteDonors();






}
