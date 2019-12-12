package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.DonorDto;
import org.academiadecodigo.alphabeat.model.Donor;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 12/12/2019.
 */
@Component
public class DonorDtoToModel extends AbstractConverter<DonorDto, Donor> {

    public Donor convert(DonorDto donorDto){

        Donor donor = new Donor();

        donor.setAge(donorDto.getAge());
        donor.setPassword(donorDto.getPassword());
        donor.setBloodType(donorDto.getBloodType());
        donor.setHivStatus(donorDto.isHivPositive());
        donor.setDiabetesStatus(donorDto.isDiabetic());
        donor.setWeight(donorDto.getWeight());
        donor.setAvailability(donorDto.isAvailable());

        return donor;
    }
}
