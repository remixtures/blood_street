package org.academiadecodigo.alphabeat.controllers;

import org.academiadecodigo.alphabeat.controllers.dto.converter.DonorDtoToModel;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToDonorDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToSuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.SuckerDtoToModel;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by codecadet on 12/12/2019.
 */

@Controller
@RequestMapping("/sucker")
public class SuckerProfileController {

    private SuckerService suckerService;

    private ModelToSuckerDto modelToSuckerDto;
    private SuckerDtoToModel suckerDtoToModel;
    private ModelToDonorDto modelToDonorDto;
    private DonorDtoToModel donorDtoToModel;



    @Autowired
    public void setSuckerService(SuckerService suckerService) {
        this.suckerService = suckerService;
    }

    @Autowired
    public void setModelToSuckerDto(ModelToSuckerDto modelToSuckerDto) {
        this.modelToSuckerDto = modelToSuckerDto;
    }

    @Autowired
    public void setSuckerDtoToModel(SuckerDtoToModel suckerDtoToModel) {
        this.suckerDtoToModel = suckerDtoToModel;
    }

    @Autowired
    public void setModelToDonorDto(ModelToDonorDto modelToDonorDto) {
        this.modelToDonorDto = modelToDonorDto;
    }

    @Autowired
    public void setDonorDtoToModel(DonorDtoToModel donorDtoToModel) {
        this.donorDtoToModel = donorDtoToModel;
    }



}
