package org.academiadecodigo.alphabeat.controllers;

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

    @Autowired
    public void setSuckerService(SuckerService suckerService) {
        this.suckerService = suckerService;
    }



}
