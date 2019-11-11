package com.intercorp.eurekaclient.services;

import com.intercorp.eurekaclient.domain.daos.Client;
import com.intercorp.eurekaclient.domain.dtos.ClientResponseDTO;
import com.intercorp.eurekaclient.domain.dtos.ClientKpiDTO;
import com.intercorp.eurekaclient.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClient(Client client) {
        return this.clientRepository.save(client);
    }

    public List<ClientResponseDTO> findAll() {
        List<ClientResponseDTO> clientsResponse;

        List<Client> clients = this.clientRepository.findAll();

        clientsResponse = clients.stream().map(ClientResponseDTO::new).collect(Collectors.toList());

        return clientsResponse;
    }

    public ClientKpiDTO getClientsKpi() {
        List<Client> clients = this.clientRepository.findAll();

        Integer clientsSize = clients.size();

        Integer ageSum = clients.stream().map(Client::getAge).reduce(0, Integer::sum);

        Double averageAge = (ageSum / (double) clientsSize);

        double variance = clients
                .stream()
                .map(client -> Math.pow(client.getAge() - averageAge, 2))
                .reduce(0.0, Double::sum) / clientsSize;

        Double standardDeviation = Math.sqrt(variance);

        return new ClientKpiDTO(averageAge, standardDeviation);
    }
}
