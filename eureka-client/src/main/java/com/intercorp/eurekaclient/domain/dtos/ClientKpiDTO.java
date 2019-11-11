package com.intercorp.eurekaclient.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientKpiDTO {

    @JsonProperty("edad_promedio")
    private Double averageAge;

    @JsonProperty("desviacion_estandard_edad")
    private Double ageStandardDeviation;

    public ClientKpiDTO() {
    }

    public ClientKpiDTO(Double averageAge, Double ageStandardDeviation) {
        this.averageAge = averageAge;
        this.ageStandardDeviation = ageStandardDeviation;
    }

    public Double getAverageAge() {
        return averageAge;
    }

    public ClientKpiDTO setAverageAge(Double averageAge) {
        this.averageAge = averageAge;
        return this;
    }

    public Double getAgeStandardDeviation() {
        return ageStandardDeviation;
    }

    public ClientKpiDTO setAgeStandardDeviation(Double ageStandardDeviation) {
        this.ageStandardDeviation = ageStandardDeviation;
        return this;
    }
}
