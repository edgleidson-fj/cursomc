package com.edgleidson.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgleidson.cursomc.domain.Cliente;

@Repository                                          
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{
}