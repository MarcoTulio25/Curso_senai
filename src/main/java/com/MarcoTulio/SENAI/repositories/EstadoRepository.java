package com.MarcoTulio.SENAI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MarcoTulio.SENAI.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	//Jpa fará todo o serviço do insert, delete, update, etc...
	//Veja que busca de Cliente e o Integer e que tipo do nosso id e Integer
	//Veja que é uma interface que extende os assuntos do JPA.

}
