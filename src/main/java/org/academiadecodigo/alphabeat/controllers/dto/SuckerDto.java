package org.academiadecodigo.alphabeat.controllers.dto;

import org.academiadecodigo.alphabeat.persistence.model.choices.BloodType;
import org.academiadecodigo.alphabeat.persistence.model.Donor;

import javax.validation.constraints.*;
import java.util.List;

/**
 * Created by codecadet on 12/12/2019.
 */
public class SuckerDto {


    @NotNull(message = "Please insert your username")
    @NotBlank(message = "Please insert your username")
    @Size(min=3, max = 16, message = "Usernames must be between 3 and 16 characters")
    @Pattern(regexp = "/w+", message = "Usernames must only contain alphanumeric characters")
    private String userName;

    @NotNull(message = "Please insert your first name")
    @NotBlank(message = "Please insert your first name")
    @Size(min=3, max = 16, message = "Names must be between 3 and 16 characters")
    @Pattern(regexp = "[A-Z][a-z]{2,15}", message = "Names must only contain letters")
    private String firstName;

    @NotNull(message = "Please insert your last name")
    @NotBlank(message = "Please insert your last name")
    @Size(min=3, max = 16, message = "Names must be between 3 and 16 characters")
    @Pattern(regexp = "[A-Z][a-z]{2,15}", message = "Names must only contain letters")
    private String lastName;



    @NotBlank(message = "Invalid Password")
    @NotNull(message = "Invalid Password")
    @Size(min=4, max=16, message = "Password must have at least 4 characters, no more than 16")
    private String password;

    private List<Donor> favoriteDonors;
    
    private BloodType favBloodType;

    @Email
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

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
