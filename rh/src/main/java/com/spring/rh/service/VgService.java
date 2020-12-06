package com.spring.rh.service;

import com.spring.rh.model.Vagas;

import java.util.List;

public interface VgService{
    List<Vagas> findAll();
    Vagas save(Vagas vg);
}
