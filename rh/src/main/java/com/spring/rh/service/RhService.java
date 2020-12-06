package com.spring.rh.service;



import com.spring.rh.model.Funcionario;

import java.util.List;
import java.util.Map;

public interface RhService {
    List<Funcionario> findAll();
    Funcionario findById(long id);
    Funcionario save(Funcionario func);
    void deleteById(long id);
    void updateFunc(long id,Funcionario func);
    Map<String, Object> getFunc(long id);


}

