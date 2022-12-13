package com.DesafioCrud.DesafioCrudCompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DesafioCrud.DesafioCrudCompleto.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}