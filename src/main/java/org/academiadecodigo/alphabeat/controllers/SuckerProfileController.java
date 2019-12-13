package org.academiadecodigo.alphabeat.controllers;

import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.DonorDtoToModel;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToDonorDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.ModelToSuckerDto;
import org.academiadecodigo.alphabeat.controllers.dto.converter.SuckerDtoToModel;
import org.academiadecodigo.alphabeat.persistence.model.Sucker;
import org.academiadecodigo.alphabeat.services.SuckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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

        model.addAttribute("sucker", modelToSuckerDto.convert(suckerService.getSucker(id)));

        return "sucker.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/css/blood.css"})
    public String showSuckerProfileCss(){
        return "/css/blood.css";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {

        model.addAttribute("sucker", modelToSuckerDto.convert(suckerService.getSucker(id)));

        return "/sucker/edit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/", params = "actions=save")
    public String addSucker(@Valid @ModelAttribute SuckerDto suckerDto, BindingResult bindingResult) {

        Sucker sucker = suckerService.addSucker(suckerDtoToModel.convert(suckerDto));

        return "redirect:/sucker/" + sucker.getId();
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
