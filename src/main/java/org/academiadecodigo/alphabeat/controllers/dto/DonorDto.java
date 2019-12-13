package org.academiadecodigo.alphabeat.controllers.dto;

import org.academiadecodigo.alphabeat.model.choices.BloodType;
import org.academiadecodigo.alphabeat.model.choices.Gender;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
public class DonorDto {


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

    @NotNull(message = "Please choose an option")
    @NotBlank(message = "Please choose an option")
    private Gender gender;

    @NotNull(message = "Please insert your age")
    @NotBlank(message = "Please insert your age")
    @Size(min=2, max = 2, message = "Suckers require suitable donors, between the ages of 18 and 99")
    @Pattern(regexp = "^0?1[89]|0?[2-9][0-9]$", message = "Suckers require suitable donors between the ages of 18 and 99")
    private Integer age;

    @NotBlank(message = "Invalid Password")
    @NotNull(message = "Invalid Password")
    @Size(min=4, max=16, message = "Password must have at least 4 characters, no more than 16")
    private String password;

    @NotNull(message = "Please choose an option")
    @NotBlank(message = "Please choose an option")
    private BloodType bloodType;

    @NotNull(message = "No judgement, but we need to know")
    private boolean hivStatus;

    @NotNull(message = "No judgment, but we need to know")
    private boolean diabetesStatus;

    @NotNull(message = "Please input your weight")
    @NotBlank(message = "Please input your weight")
    @Size(min=2, max = 3, message = "Suckers require donors with a weight between 50 and 500kg")
    @Pattern(regexp = "^0?[5-9][0-9]|0?[1-4][0-9][0-9]$", message = "Suckers require donors with weights between 50 and 500kg")
    private Integer weight;

    private List<Integer> ratings;
    private Map<String, Integer> reviews;

    @NotNull(message = "Please let us know if you're currently available to donate")
    private boolean availability;
    private Integer id;

    @Email
    private String email;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isHivPositive() {
        return hivStatus;
    }

    public void setHivStatus(boolean hivStatus) {
        this.hivStatus = hivStatus;
    }

    public boolean isDiabetic() {
        return diabetesStatus;
    }

    public void setDiabetesStatus(boolean diabetesStatus) {
        this.diabetesStatus = diabetesStatus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public Map<String, Integer> getReviews() {
        return reviews;
    }

    public void setReviews(Map<String, Integer> reviews) {
        this.reviews = reviews;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
