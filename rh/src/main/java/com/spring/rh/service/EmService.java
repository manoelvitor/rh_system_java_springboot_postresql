package com.spring.rh.service;

import com.spring.rh.model.Empresas;

import java.util.List;
import java.util.Map;

public interface EmService {


    List<Empresas> findAll();
    Empresas save(Empresas emp);


}
