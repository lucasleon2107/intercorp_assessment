package com.intercorp.eurekaclient.controllers;

import com.intercorp.eurekaclient.domain.daos.Client;
import com.intercorp.eurekaclient.domain.dtos.ClientRequestDTO;
import com.intercorp.eurekaclient.domain.dtos.ClientResponseDTO;
import com.intercorp.eurekaclient.domain.dtos.ClientKpiDTO;
import com.intercorp.eurekaclient.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/creacliente")
    public ResponseEntity<ClientResponseDTO> createClient(@RequestBody ClientRequestDTO clientRequestDTO) {
        Client client = new Client(clientRequestDTO.getName(), clientRequestDTO.getLastName(), clientRequestDTO.getDateOfBirth());

        return new ResponseEntity<>(new ClientResponseDTO(this.clientService.saveClient(client)), HttpStatus.CREATED);
    }

    @GetMapping("/kpideclientes")
    public ResponseEntity<ClientKpiDTO> getClientsKpi() {
        return new ResponseEntity<>(this.clientService.getClientsKpi(), HttpStatus.OK);
    }

    @GetMapping("/listclientes")
    public ResponseEntity<List<ClientResponseDTO>> getClientList() {
        return new ResponseEntity<>(this.clientService.findAll(), HttpStatus.OK);
    }
}
