package com.example.demo.controller;

import com.example.demo.model.Beer;
import com.example.demo.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@Slf4j
@Controller
public class BeerController {

    @Autowired
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Get Beer By Id  in controller");
        return  beerService.getBeerById(id);
    }
}
