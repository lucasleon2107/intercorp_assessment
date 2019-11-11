package com.intercorp.eurekaclient.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

public class ClientRequestDTO {

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("apellido")
    private String lastName;

    @JsonProperty("fecha_nacimiento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "01/01/2019")
    private LocalDate dateOfBirth;

    public ClientRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public ClientRequestDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ClientRequestDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public ClientRequestDTO setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
}
