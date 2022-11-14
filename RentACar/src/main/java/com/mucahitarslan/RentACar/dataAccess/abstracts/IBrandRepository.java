package com.mucahitarslan.RentACar.dataAccess.abstracts;

import com.mucahitarslan.RentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBrandRepository extends JpaRepository<Brand,Integer>
{

}
