package com.example.demo.services;

import com.example.demo.model.Beer;
import com.example.demo.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl()
    {
        this.beerMap = new HashMap<>();

       Beer beer1 =  Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

       Beer beer2  =  Beer.builder()
               .id(UUID.randomUUID())
               .version(1)
               .beerName("Crank")
               .beerStyle(BeerStyle.LAGER)
               .upc("1234223")
               .price(new BigDecimal("11.99"))
               .quantityOnHand(392)
               .createdDate(LocalDateTime.now())
               .updateDate(LocalDateTime.now())
               .build();

        Beer beer3  =  Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Tuberg")
                .beerStyle(BeerStyle.LAGER)
                .upc("1239993")
                .price(new BigDecimal("8.99"))
                .quantityOnHand(32)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);

    }

    @Override
    public List<Beer> listBeers(){
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer Id in Service layer was called");
        return beerMap.get(id);
    }
}
