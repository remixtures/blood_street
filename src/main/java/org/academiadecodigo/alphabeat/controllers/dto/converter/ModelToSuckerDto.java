package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.model.Sucker;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 12/12/2019.
 */
@Component
public class ModelToSuckerDto extends AbstractConverter<Sucker, SuckerDto> {

    public SuckerDto convert(Sucker sucker){

        SuckerDto suckerDto = new SuckerDto();

        suckerDto.setUserName(sucker.getUserName());
        suckerDto.setFirstName(sucker.getFirstName());
        suckerDto.setLastName(sucker.getLastName());
        suckerDto.setGender(sucker.getGender());

        suckerDto.setEmail(sucker.getEmail());
        suckerDto.setPassword(sucker.getPassword());
        suckerDto.setFavBloodType(sucker.getFavBloodType());
        suckerDto.setNumberOfRatings(sucker.getNumberOfRatings());

        suckerDto.setId(sucker.getId());

        return suckerDto;
    }
}
