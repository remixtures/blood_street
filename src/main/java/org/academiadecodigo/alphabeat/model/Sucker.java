package org.academiadecodigo.alphabeat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public class Sucker extends AbstractModel {

    private String password;
    private List<Donor> favoriteDonors;
    private String favBloodType;
    private String email;
    private Integer numberOfRatings;

    public Sucker() {
        favoriteDonors = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Donor> getFavoriteDonors() {
        return favoriteDonors;
    }

    public void addFavoriteDonor(Donor donor) {
        favoriteDonors.add(donor);
    }

    public void removeFavoriteDonor(Donor donor) {
        favoriteDonors.remove(donor);
    }

    public String getFavBloodType() {
        return favBloodType;
    }

    public void setFavBloodType(String favBloodType) {
        this.favBloodType = favBloodType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    public void addRating() {
        numberOfRatings++;
    }

    public void setFavoriteDonors(List<Donor> favoriteDonors) {
        this.favoriteDonors = favoriteDonors;
    }

    public void setNumberOfRatings(Integer numberOfRatings){
        this.numberOfRatings = numberOfRatings;
    }
}
