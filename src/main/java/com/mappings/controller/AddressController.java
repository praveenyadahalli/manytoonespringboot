package com.mappings.controller;

import com.mappings.entities.AddressEntity;
import com.mappings.respository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepo addRepository;

    @GetMapping("/getAddress")
    public List<AddressEntity> getEmployees(){
        return addRepository.findAll();
    }
}