package org.academiadecodigo.alphabeat.persistence.model.choices;

/**
 * Created by codecadet on 13/12/2019.
 */
public enum BloodType {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-");

    BloodType(String s) {
        name = s;
    }

    private String name;

}
