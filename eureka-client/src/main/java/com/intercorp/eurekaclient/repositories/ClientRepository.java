package com.intercorp.eurekaclient.repositories;

import com.intercorp.eurekaclient.domain.daos.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
