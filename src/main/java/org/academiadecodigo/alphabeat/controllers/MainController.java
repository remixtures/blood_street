package org.academiadecodigo.alphabeat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by codecadet on 12/12/2019.
 */
public class MainController {


    @RequestMapping("/")
    public String landing() {
        return "redirect:/bloodstreet";
    }

}
