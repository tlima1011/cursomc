package com.thiagomoura.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagomoura.cursomc.domain.Cliente;
import com.thiagomoura.cursomc.repositories.ClienteRepository;
import com.thiagomoura.cursomc.services.exceptions.*;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
		
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
