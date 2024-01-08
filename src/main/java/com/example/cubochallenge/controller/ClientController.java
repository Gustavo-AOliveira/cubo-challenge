package com.example.cubochallenge.controller;

import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.entity.ClientDTO.DataSaveDTO;
import com.example.cubochallenge.service.ClientService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("api/clients")
public class ClientController {
    private ClientService service;
    public ClientController(ClientService service) {
        this.service = service;
    }
    @PostMapping
    @Transactional
    public ResponseEntity<Client> saveClient(@RequestBody @Valid DataSaveDTO data, UriComponentsBuilder uriBuilder){
        var client = service.saveClient(data);
        var uri = uriBuilder.path("api/clients{id}").buildAndExpand(client.getId()).toUri();
            return ResponseEntity.created(uri).body(client);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClientes(){
        List<Client> clientList = service.getAll();
            return ResponseEntity.ok(clientList);
    }





}
