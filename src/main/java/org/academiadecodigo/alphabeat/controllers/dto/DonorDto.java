package org.academiadecodigo.alphabeat.controllers.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
public class DonorDto {

    @NotNull(message = "Please insert your age")
    @NotBlank(message = "Please insert your age")
    @Pattern(regexp = "\\s[0-9]{1}[0-9]{0,1}", message = "Please input an age between 0 and ")
    private Integer age;

    @NotBlank(message = "Invalid Password")
    @NotNull(message = "Invalid Password")
    @Size(min=4, max=16, message = "Password must have at least 4 characters, no more than 16")
    private String password;


    private String bloodType;
    private boolean hivStatus;
    private boolean diabetesStatus;
    private Integer weight;
    private List<Integer> ratings;
    private Map<String, Integer> reviews;
    private boolean availability;
    private Integer id;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
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
}
