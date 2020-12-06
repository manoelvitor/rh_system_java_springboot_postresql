package com.spring.rh.repository;

import com.spring.rh.model.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresasRepository extends JpaRepository<Empresas, Long> { // COM JpaRepository a aplicação ficara com metodos do crud: save, delete, update etc...


}
