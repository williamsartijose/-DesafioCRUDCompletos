package com.DesafioCrud.DesafioCrudCompleto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DesafioCrud.DesafioCrudCompleto.entities.Client;

@RestController
@RequestMapping(value = "/categories")
public class ClientResources {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Will", "43159876896", null, null, null));
		list.add(new Client(2L, "Lucas", null, null, null, null));
		return ResponseEntity.ok().body(list);
	}

}
