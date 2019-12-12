package org.academiadecodigo.alphabeat.services;

import org.academiadecodigo.alphabeat.model.Donor;
import org.academiadecodigo.alphabeat.model.Sucker;

import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public interface SuckerService {

    Sucker getSucker(Integer id);

    Sucker addSucker(Sucker sucker);

    void deleteSucker(Integer id);

    List<Sucker> listSuckers();

    String writeReview(Integer donorId);

    Integer addRating(Integer id);

    String registerFavoriteBloodType(Integer id, String bloodType);

    void addFavoriteDonor(Integer suckerId, Integer donorId);

    void deleteFavoriteDonor(Integer suckerId, Integer donorId);

    List<Donor> listFavoriteDonors(Integer id);






}
