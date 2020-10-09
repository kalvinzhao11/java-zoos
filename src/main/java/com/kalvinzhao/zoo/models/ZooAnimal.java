package com.kalvinzhao.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimal extends Auditable implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name= "animalid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Animal animal;

    @Column(nullable = false)
    private String incomingzoo;

    public ZooAnimal(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    public ZooAnimal() {
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal that = (ZooAnimal) o;
        return ((this.zoo == null) ? 0 : this.zoo.getZooid()) == ((that.zoo == null) ? 0 : that.zoo.getZooid()) &&
                ((this.animal == null) ? 0 : this.animal.getAnimalid()) == ((that.animal == null) ? 0 : that.animal.getAnimalid());
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
