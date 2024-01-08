package com.example.cubochallenge.service;

import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.entity.ClientDTO.DataSaveDTO;
import com.example.cubochallenge.repository.ClientRepository;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository repository;
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client saveClient(DataSaveDTO data){
        var client = new Client(data);
        repository.save(client);
            return client;
    }
    public List<Client> getAll(){
        return repository.findAll();
    }

}
