package com.example.cubochallenge.service;

import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.entity.ClientDTO.DataSaveDTO;
import com.example.cubochallenge.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {
    @InjectMocks
    private ClientService clientService;

    @Mock
    private ClientRepository clientRepository;

    private Client client;
    private DataSaveDTO clientDto;

    @BeforeEach
    void setup(){
        client = new Client(1L,"Gustavo", "Aquino",new BigDecimal("10"));

        clientDto = new DataSaveDTO("Gustavo", "Aquino",new BigDecimal("10"));
    }


    @Test
    @DisplayName("Should return a client")
    public void saveClientCase1(){

        when(clientRepository.save(any())).thenReturn(client);

        var clientSaved = clientService.saveClient(clientDto);

        assertThat(clientSaved.getId()).isEqualTo(client.getId());
        verify(clientRepository, times(1)).save(any());
    }

    @Test
    @DisplayName("Should return success if client is not null")
    public void saveClientCase2(){

        when(clientRepository.save(any())).thenReturn(client);

        var clientSaved = clientService.saveClient(clientDto);

        assertThat(clientSaved).isNotNull();
    }

    @Test
    public void getAllCase1(){
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client);
        clients.add(client);

        when(clientRepository.findAll()).thenReturn(clients);

        List<Client> clientsResult = clientService.getAll();

        assertThat(clientsResult).hasSize(3);
        assertThat(clientsResult).isEqualTo(clients);
    }
}













