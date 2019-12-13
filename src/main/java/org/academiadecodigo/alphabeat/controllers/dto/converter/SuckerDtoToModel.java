package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.persistence.model.Sucker;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 12/12/2019.
 */
@Component
public class SuckerDtoToModel extends AbstractConverter<SuckerDto, Sucker>{

    private SuckerService suckerService;

    public Sucker convert(SuckerDto suckerDto){

        Sucker sucker = (suckerDto.getId() != null ?
                suckerService.getSucker(suckerDto.getId()) : new Sucker());

        sucker.setUserName(suckerDto.getUserName());
        sucker.setFirstName(suckerDto.getFirstName());
        sucker.setLastName(suckerDto.getLastName());


        sucker.setPassword(suckerDto.getPassword());
        sucker.setFavBloodType(suckerDto.getFavBloodType());
        sucker.setEmail(suckerDto.getEmail());
        sucker.setNumberOfRatings(suckerDto.getNumberOfRatings());

        return sucker;
    }

    @Autowired
    public void setSuckerService(SuckerService suckerService) {
        this.suckerService = suckerService;
    }
}
