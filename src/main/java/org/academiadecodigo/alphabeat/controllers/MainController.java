package org.academiadecodigo.alphabeat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 12/12/2019.
 */
public class MainController {



    @RequestMapping(method = RequestMethod.GET, value = {"/", "/home", ""})
    public String landing() {
        return "redirect:/bloodstreet";
    }



}
