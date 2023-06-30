package com.example.dynamicJsonRead.dynamicJsonRead.Controller;

import com.example.dynamicJsonRead.dynamicJsonRead.Service.PlanogramService;
import com.example.dynamicJsonRead.dynamicJsonRead.model.Root;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
@Component
@RestController
@RequestMapping("/myservice")
public class controllerRest {
    @Autowired
    PlanogramService planogramService;

    @RequestMapping(
            value = "/process",
            method = RequestMethod.POST)
    public void process(@RequestBody String payload)
            throws Exception {

        Root root ;
        try{

            ObjectMapper jsonMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                    false);

            root = jsonMapper.readValue(payload, Root.class);
            planogramService.getPlanoIdList(root);


        }catch (Exception e){
            System.out.println("The Exception"+e);
        }


        }


    }






