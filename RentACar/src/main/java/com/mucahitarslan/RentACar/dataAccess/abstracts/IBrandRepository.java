package com.mucahitarslan.RentACar.dataAccess.abstracts;

import com.mucahitarslan.RentACar.entities.concretes.Brand;

import java.util.List;

public interface IBrandRepository
{
    List<Brand> getAll();

}
