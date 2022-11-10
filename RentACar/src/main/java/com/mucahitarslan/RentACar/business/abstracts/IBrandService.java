package com.mucahitarslan.RentACar.business.abstracts;

import com.mucahitarslan.RentACar.entities.concretes.Brand;


import java.util.List;

public interface IBrandService
{
    List<Brand> getAll();
}
