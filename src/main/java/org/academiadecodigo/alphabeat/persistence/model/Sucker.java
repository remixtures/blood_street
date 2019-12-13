package org.academiadecodigo.alphabeat.persistence.model;

import org.academiadecodigo.alphabeat.persistence.model.choices.BloodType;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sucker extends AbstractModel {

    private String firstName;
    private String lastName;
    private String userName;

    private String password;
    private List<Donor> favoriteDonors;
    private BloodType favBloodType;
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

    public BloodType getFavBloodType() {
        return favBloodType;
    }

    public void setFavBloodType(BloodType favBloodType) {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
