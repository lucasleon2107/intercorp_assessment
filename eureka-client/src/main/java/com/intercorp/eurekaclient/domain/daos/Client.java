package com.intercorp.eurekaclient.domain.daos;

import com.intercorp.eurekaclient.utils.RandomDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String lastName;

    private LocalDate dateOfBirth;

    private LocalDate dateOfDeath;

    public Client() {
    }

    public Client(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = new RandomDate(dateOfBirth.plusYears(getAge()), dateOfBirth.plusYears(100)).nextDate();
    }

    public Long getId() {
        return id;
    }

    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Client setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Client setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Integer getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public Client setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        return this;
    }
}
