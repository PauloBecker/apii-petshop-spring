package com.example.apipetshop.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String name;
    private String especie;
    private String raca;
    private double altura;
    private String tipoPelagem;
    @Column(nullable = false, updatable = false)
    private String animalCode;

    public Animal() {
    }

    public Animal(Long id, String name, String especie, String raca, double altura, String tipoPelagem) {
        this.id = id;
        this.name = name;
        this.especie = especie;
        this.raca = raca;
        this.altura = altura;
        this.tipoPelagem = tipoPelagem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAnimalCode(String animalCode) {

        this.animalCode = animalCode;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", altura=" + altura +
                ", tipoPelagem='" + tipoPelagem + '\'' +
                '}';
    }
}
