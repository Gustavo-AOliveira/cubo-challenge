package com.example.cubochallenge.repository;

import com.example.cubochallenge.entity.Client;
import com.example.cubochallenge.entity.ClientDTO.DataSaveDTO;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepository;

    private Client client;
    @Autowired
    private EntityManager entityManager;

    @BeforeEach
     void setup(){
         client = new Client("Gustavo", "Aquino",new BigDecimal("10"));
    }

    @Test
    @DisplayName("Should return a client")
    void saveClientCase1(){

        var clientSaved = clientRepository.save(client);

        assertThat(clientSaved).isEqualTo(client);
        assertThat(clientSaved.getId()).isNotNull();

    }

    @Test
    @DisplayName("Should return a client with id")
    void saveClientCase2(){

        var clientSaved = clientRepository.save(client);

        assertThat(clientSaved.getId()).isNotNull();
    }

    @Test
    @DisplayName("Should return all clients in db")
    void findAllCase1(){

        var client = new Client("Gustavo", "Aquino",new BigDecimal("10"));
        var client2 = new Client("Gustavo", "Aquino",new BigDecimal("10"));

        createClient(client);
        createClient(client2);

        List<Client> clientList = clientRepository.findAll();

        assertThat(clientList).hasSize(2);
    }

    @Test
    @DisplayName("Should return a empty list")
    void findAllCase2(){

        List<Client> clientList = clientRepository.findAll();

        assertThat(clientList).isEmpty();
    }



    private Client createClient(Client client){
        entityManager.persist(client);
            return client;
    }
}













