package com.example.demo.controllers;

import com.example.demo.DTO.CarDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {



    @GetMapping("/cars")
    public CarDTO getcar(){
        return new CarDTO("1","BMW Mi8",141.750);
    }

    @PostMapping("/create-cars")
    public void createCars(@RequestBody CarDTO carDTO){
    }

    @PostMapping("created-cars")
    public String createdCars(@RequestBody CarDTO carDTO){
        /**
         * Faccio una richiesta POST in cui creo il JSON
         * Alla creazione mi dà in console postman "Created"
         * e successivamente lo invia qui
         */
        System.out.println("Arrivo nuova macchina: " + carDTO);
        return "Created";
    }



}
