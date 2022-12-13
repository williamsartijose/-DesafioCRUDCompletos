package com.DesafioCrud.DesafioCrudCompleto.dto;

import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birtDate;
	private Instant children;
	
	public ClientDTO() {
		
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant birtDate, Instant children) {

		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birtDate = birtDate;
		this.children = children;
	}
	
	
	
	
}
