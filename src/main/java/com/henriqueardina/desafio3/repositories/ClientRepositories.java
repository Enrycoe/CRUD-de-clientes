package com.henriqueardina.desafio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriqueardina.desafio3.entities.Client;

public interface ClientRepositories extends JpaRepository<Client, Long> {

}
