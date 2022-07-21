package com.example.demo2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.models.PuntosModel;

@Repository
public interface PuntosRepository extends CrudRepository<PuntosModel, Long> {

}
