package com.mucahitarslan.RentACar.business.abstracts;

import com.mucahitarslan.RentACar.business.concretes.requests.CreateBrandRequest;
import com.mucahitarslan.RentACar.business.concretes.responses.GetAllBrandsResponse;

import java.util.List;

public interface IBrandService
{
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
