package com.example.demo2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.models.CuentoModel;

@Repository
public interface CuentoRepository extends CrudRepository<CuentoModel, Long> {

}
