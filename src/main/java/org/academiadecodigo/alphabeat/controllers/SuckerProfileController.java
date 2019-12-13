package org.academiadecodigo.alphabeat.controllers;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.DonorDtoToModel;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToDonorDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToSuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.SuckerDtoToModel;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(method = RequestMethod.GET, value = {"/{id}"})
    public String showSuckerProfile(@PathVariable Integer id, Model model){

        //authentication

        model.addAttribute("donor", modelToSuckerDto.convert(suckerService.getSucker(id)));

        return "/sucker/profile";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {

        model.addAttribute("sucker", modelToSuckerDto.convert(suckerService.getSucker(id)));

        return "/sucker/edit";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/")
    public String editSucker(@ModelAttribute SuckerDto suckerDto) {


        return "redirect: / ";
    }







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
