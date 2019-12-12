package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.DonorDto;
import org.academiadecodigo.alphabeat.model.Donor;

/**
 * Created by codecadet on 12/12/2019.
 */
public class ModelToDonorDto {

    public DonorDto convert(Donor donor){

        DonorDto donorDto = new DonorDto();

        donorDto.setAge(donor.getAge());
        donorDto.setBloodType(donor.getBloodType());
        donorDto.setHivStatus(donor.isHivPositive());
        donorDto.setDiabetesStatus(donor.isDiabetic());
        donorDto.setWeight(donor.getWeight());
        donorDto.setAvailability(donor.isAvailable());

        return donorDto;
    }
}
