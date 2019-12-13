package org.academiadecodigo.alphabeat.controllers;


import org.academiadecodigo.alphabeat.controllers.dto.SuckerDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", "/home", ""})
    public String landing(@ModelAttribute("sucker") SuckerDto suckerDto) {
        return "login.html";
    }

    @RequestMapping(method = RequestMethod.GET, path = "css/blood.css")
    public String landingCss(){
        return "css/blood.css";
    }




}
