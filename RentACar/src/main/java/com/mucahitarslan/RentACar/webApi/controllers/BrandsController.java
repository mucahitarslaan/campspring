package com.mucahitarslan.RentACar.webApi.controllers;

import com.mucahitarslan.RentACar.business.abstracts.IBrandService;
import com.mucahitarslan.RentACar.business.concretes.requests.CreateBrandRequest;
import com.mucahitarslan.RentACar.business.concretes.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branßds")
public class BrandsController
{
    private IBrandService iBrandService;

    @Autowired
    public BrandsController(IBrandService iBrandService) {
        this.iBrandService = iBrandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll()
    {
        return iBrandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest)
    {
        this.iBrandService.add(createBrandRequest);
    }
}
