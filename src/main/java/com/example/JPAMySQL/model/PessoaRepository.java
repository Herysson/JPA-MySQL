package com.example.JPAMySQL.model;

import org.springframework.data.repository.CrudRepository;
//CRUD Creat, Read, Update, Delete da minha classe Pessoa
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}
