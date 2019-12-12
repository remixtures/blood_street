package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.DonorDto;
import org.academiadecodigo.alphabeat.model.Donor;

/**
 * Created by codecadet on 12/12/2019.
 */
public class DonorDtoToModel {

    public Donor convert(DonorDto donorDto){

        Donor donor = new Donor();

        donor.setAge(donorDto.getAge());
        donor.setPassword(donorDto.getPassword());
        donor.setBloodType(donorDto.getBloodType());
        donor.setHivStatus(donorDto.isHivStatus());
        donor.setDiabetesStatus(donorDto.isDiabetesStatus());
        donor.setWeight(donorDto.getWeight());
        donor.setAvailability(donorDto.isAvailability());

        return donor;
    }
}
