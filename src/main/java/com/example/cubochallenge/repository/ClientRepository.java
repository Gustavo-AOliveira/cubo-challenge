package com.example.cubochallenge.repository;

import com.example.cubochallenge.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
