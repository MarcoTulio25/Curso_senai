package com.MarcoTulio.SENAI.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarcoTulio.SENAI.domain.Cliente;
import com.MarcoTulio.SENAI.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = repo.findById(idCliente);
		return obj.orElse(null);
		
	}
	
}
