package org.academiadecodigo.alphabeat.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 12/12/2019.
 */
public class Donor extends AbstractModel{

    private Integer age;
    private String bloodType;
    private boolean hivStatus;
    private boolean diabetesStatus;
    private Integer weight;
    private List<Integer> ratings;
    private Map<String, Sucker> reviews;
    private boolean availability;

    public Donor(){
        List<Integer> ratings = new ArrayList<>();
    }


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

    public boolean isHivStatus() {
        return hivStatus;
    }

    public void setHivStatus(boolean hivStatus) {
        this.hivStatus = hivStatus;
    }

    public boolean isDiabetesStatus() {
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

    public Map<String, Sucker> getReviews() {
        return reviews;
    }

    public void setReviews(Map<String, Sucker> reviews) {
        this.reviews = reviews;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
