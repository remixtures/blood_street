package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.model.Sucker;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 12/12/2019.
 */
@Component
public class SuckerDtoToModel extends AbstractConverter<SuckerDto, Sucker>{

    public Sucker convert(SuckerDto suckerDto){

        Sucker sucker = new Sucker();

        sucker.setPassword(suckerDto.getPassword());
        sucker.setFavBloodType(suckerDto.getFavBloodType());
        sucker.setEmail(suckerDto.getEmail());
        sucker.setNumberOfRatings(suckerDto.getNumberOfRatings());

        return sucker;
    }
}
