package com.example.demo.services;

import com.example.demo.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);

}