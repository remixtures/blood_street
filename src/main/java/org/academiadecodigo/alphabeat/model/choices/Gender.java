package org.academiadecodigo.alphabeat.model.choices;

/**
 * Created by codecadet on 13/12/2019.
 */
public enum Gender {
    MALE ("Male"),
    FEMALE ("Female"),
    NON_BINARY ("Non-binary"),
    UNDISCLOSED ("Rather not say");

    Gender(String s) {
        s = name;
    }

    private String name;

}
