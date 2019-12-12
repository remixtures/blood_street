package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.model.Sucker;

/**
 * Created by codecadet on 12/12/2019.
 */
public class SuckerDtoToModel {

    public Sucker convert(SuckerDto suckerDto){

        Sucker sucker = new Sucker();

        sucker.setPassword(suckerDto.getPassword());
        sucker.setFavBloodType(suckerDto.getFavBloodType());
        sucker.setEmail(suckerDto.getEmail());
        sucker.setNumberOfRatings(suckerDto.getNumberOfRatings());

        return sucker;
    }
}
