package com.spring.rh.repository;

import com.spring.rh.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;






public interface RhRepository extends JpaRepository<Funcionario, Long> { // COM JpaRepository a aplicação ficara com metodos do crud: save, delete, update etc...


}
