package com.DesafioCrud.DesafioCrudCompleto.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DesafioCrud.DesafioCrudCompleto.dto.ClientDTO;
import com.DesafioCrud.DesafioCrudCompleto.entities.Client;
import com.DesafioCrud.DesafioCrudCompleto.repositories.ClientRepository;
import com.DesafioCrud.DesafioCrudCompleto.service.exceptions.ResourceNotFoundException;



@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);

		return list.map(x -> new ClientDTO(x));
	}
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}
	
	}
