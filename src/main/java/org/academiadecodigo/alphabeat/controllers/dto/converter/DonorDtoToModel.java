package org.academiadecodigo.alphabeat.controllers.dto.converter;

import org.academiadecodigo.alphabeat.controllers.dto.DonorDto;
import org.academiadecodigo.alphabeat.model.Donor;
import org.academiadecodigo.alphabeat.services.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 12/12/2019.
 */
@Component
public class DonorDtoToModel extends AbstractConverter<DonorDto, Donor> {

    private DonorService donorService;

    public Donor convert(DonorDto donorDto){

        Donor donor = (donorDto.getId() != null ?
                donorService.getDonor(donorDto.getId()) : new Donor());

        donor.setUserName(donorDto.getUserName());
        donor.setFirstName(donorDto.getFirstName());
        donor.setLastName(donorDto.getLastName());


        donor.setAge(donorDto.getAge());
        donor.setPassword(donorDto.getPassword());
        donor.setBloodType(donorDto.getBloodType());
        donor.setHivStatus(donorDto.isHivPositive());
        donor.setDiabetesStatus(donorDto.isDiabetic());
        donor.setWeight(donorDto.getWeight());
        donor.setAvailability(donorDto.isAvailable());
        donor.setEmail(donorDto.getEmail());

        return donor;
    }

    @Autowired
    public void setDonorService(DonorService donorService) {
        this.donorService = donorService;
    }
}
