package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.model.Sucker;

/**
 * Created by codecadet on 12/12/2019.
 */
public class ModelToSuckerDto {

    public SuckerDto convert(Sucker sucker){

        SuckerDto suckerDto = new SuckerDto();

        suckerDto.setEmail(sucker.getEmail());
        suckerDto.setPassword(sucker.getPassword());
        suckerDto.setFavBloodType(sucker.getFavBloodType());
        suckerDto.setNumberOfRatings(sucker.getNumberOfRatings());

        return suckerDto;
    }
}
