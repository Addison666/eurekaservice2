package com.add.eurekaservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by THLiu on 5/25/2018.
 *
 */
@RestController
public class ResourceController {

    @RequestMapping(value = "api/resource", method = RequestMethod.GET)
    public String resource (){
        return "service2 successful";
    }
}
