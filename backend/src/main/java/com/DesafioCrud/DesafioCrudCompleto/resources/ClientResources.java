package com.DesafioCrud.DesafioCrudCompleto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DesafioCrud.DesafioCrudCompleto.entities.Client;
import com.DesafioCrud.DesafioCrudCompleto.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {
	
	@Autowired
	private ClientService service;
	
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
	List<Client> list = service.findAll();	
		return ResponseEntity.ok().body(list);
	}

}
