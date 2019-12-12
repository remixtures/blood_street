package org.academiadecodigo.alphabeat.controllers.dto;

import org.academiadecodigo.alphabeat.model.Donor;

import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public class SuckerDto {

    private String password;
    private List<Donor> favoriteDonors;
    private String favBloodType;
    private String email;
    private Integer numberOfRatings;
    private Integer id;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Donor> getFavoriteDonors() {
        return favoriteDonors;
    }

    public void setFavoriteDonors(List<Donor> favoriteDonors) {
        this.favoriteDonors = favoriteDonors;
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

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
