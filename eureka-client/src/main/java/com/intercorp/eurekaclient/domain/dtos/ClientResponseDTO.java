package com.intercorp.eurekaclient.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercorp.eurekaclient.domain.daos.Client;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

public class ClientResponseDTO {
    private Long id;

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("apellido")
    private String lastName;

    @JsonProperty("fecha_nacimiento")
    @JsonFormat(pattern="dd/MM/yyyy")
    @ApiModelProperty(example = "01/01/2019")
    private LocalDate dateOfBirth;

    @JsonProperty("edad")
    private Integer age;

    @JsonProperty("probable_fecha_muerte")
    @JsonFormat(pattern="dd/MM/yyyy")
    @ApiModelProperty(example = "01/01/2019")
    private LocalDate dateOfDeath;

    public ClientResponseDTO() {
    }

    public ClientResponseDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.lastName = client.getLastName();
        this.dateOfBirth = client.getDateOfBirth();
        this.age = client.getAge();
        this.dateOfDeath = client.getDateOfDeath();
    }


    public Long getId() {
        return id;
    }

    public ClientResponseDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClientResponseDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ClientResponseDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public ClientResponseDTO setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public ClientResponseDTO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public ClientResponseDTO setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        return this;
    }
}
