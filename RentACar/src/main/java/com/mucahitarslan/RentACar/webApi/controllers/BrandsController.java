package com.mucahitarslan.RentACar.webApi.controllers;

import com.mucahitarslan.RentACar.business.abstracts.IBrandService;
import com.mucahitarslan.RentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController
{
    private IBrandService iBrandService;

    @Autowired
    public BrandsController(IBrandService iBrandService) {
        this.iBrandService = iBrandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll()
    {
        return iBrandService.getAll();
    }
}
