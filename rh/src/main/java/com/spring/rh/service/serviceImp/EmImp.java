package com.spring.rh.service.serviceImp;

import com.spring.rh.model.Empresas;

import com.spring.rh.model.Funcionario;
import com.spring.rh.repository.EmpresasRepository;

import com.spring.rh.service.EmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;


import java.util.List;
@Service
public class EmImp implements EmService {
    @Autowired// ponto de injeção para usar as instancias do repository
    EmpresasRepository emRepository;


    @Override
    public List<Empresas> findAll() {
        return emRepository.findAll();
    }

    @Override
    public Empresas save(Empresas emp) {
        return emRepository.save(emp);
    }


}
