package org.academiadecodigo.alphabeat.controllers;

import org.academiadecodigo.alphabeat.controllers.dto.converter.DonorDtoToModel;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToDonorDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToSuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.SuckerDtoToModel;
import org.academiadecodigo.alphabeat.services.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 12/12/2019.
 */
@Controller
@RequestMapping("/donor")
public class DonorProfileController {

    private DonorService donorService;

    private ModelToDonorDto modelToDonorDto;
    private DonorDtoToModel donorDtoToModel;
    private ModelToSuckerDto modelToSuckerDto;
    private SuckerDtoToModel suckerDtoToModel;

    @RequestMapping(method = RequestMethod.GET, value = {"/{id}"})
    public String showDonorProfile(@PathVariable Integer id, Model model){

        //authentication

        model.addAttribute("donor", modelToDonorDto.convert(donorService.getDonor(id)));

        return "/donor/profile";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/edit/{id}}")
    public String showEdit(@PathVariable Integer id, Model model){

        model.addAttribute("donor", modelToDonorDto.convert(donorService.getDonor(id)));

        return "/donor/edit";
    }






    @Autowired
    public void setDonorService(DonorService donorService) {
        this.donorService = donorService;
    }

    @Autowired
    public void setModelToDonorDto(ModelToDonorDto modelToDonorDto) {
        this.modelToDonorDto = modelToDonorDto;
    }

    @Autowired
    public void setDonorDtoToModel(DonorDtoToModel donorDtoToModel) {
        this.donorDtoToModel = donorDtoToModel;
    }

    @Autowired
    public void setModelToSuckerDto(ModelToSuckerDto modelToSuckerDto) {
        this.modelToSuckerDto = modelToSuckerDto;
    }

    @Autowired
    public void setSuckerDtoToModel(SuckerDtoToModel suckerDtoToModel) {
        this.suckerDtoToModel = suckerDtoToModel;
    }


}
