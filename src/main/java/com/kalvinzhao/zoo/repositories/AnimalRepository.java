package com.kalvinzhao.zoo.repositories;

import com.kalvinzhao.zoo.models.Animal;
import com.kalvinzhao.zoo.views.AnimalCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT a.animaltype, a.animalid, count(za.zooid) countzoos " +  // name is name and countmenus is countmenus from MenuCounts in views
            "FROM animals a LEFT JOIN zooanimals za " +
            "ON a.animalid = za.animalid " +
            "GROUP BY a.animaltype " +
            "ORDER BY a.animaltype", nativeQuery = true) //take this sql as it's written, want spring to send it to the database run it and bring back info
    List<AnimalCount> findAnimalCount();
}
