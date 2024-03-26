package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BeerControllerTest {

    @Autowired
    BeerController beerController;


    @Test
    void getBeerById() {
        log.debug("Running Test Beer Controller");
        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
}