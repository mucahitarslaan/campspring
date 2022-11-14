package com.mucahitarslan.RentACar.business.concretes;

import com.mucahitarslan.RentACar.business.abstracts.IBrandService;
import com.mucahitarslan.RentACar.dataAccess.abstracts.IBrandRepository;
import com.mucahitarslan.RentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements IBrandService
{
    private final IBrandRepository iBrandRepository;

    @Autowired
    public BrandManager(IBrandRepository iBrandRepository) {
        this.iBrandRepository = iBrandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return iBrandRepository.findAll();
    }
}
