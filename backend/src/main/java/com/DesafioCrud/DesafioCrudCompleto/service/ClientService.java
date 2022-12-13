package com.DesafioCrud.DesafioCrudCompleto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DesafioCrud.DesafioCrudCompleto.entities.Client;
import com.DesafioCrud.DesafioCrudCompleto.repositories.ClientRepository;



@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public List<Client> findAll(){ 
		
		return repository.findAll();
	}
}
