package com.mucahitarslan.RentACar.business.concretes;

import com.mucahitarslan.RentACar.business.abstracts.IBrandService;
import com.mucahitarslan.RentACar.business.concretes.requests.CreateBrandRequest;
import com.mucahitarslan.RentACar.business.concretes.responses.GetAllBrandsResponse;
import com.mucahitarslan.RentACar.dataAccess.abstracts.IBrandRepository;
import com.mucahitarslan.RentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = iBrandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands)
        {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.iBrandRepository.save(brand);
    }
}
