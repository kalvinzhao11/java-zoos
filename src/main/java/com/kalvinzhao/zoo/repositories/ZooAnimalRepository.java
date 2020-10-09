package com.kalvinzhao.zoo.repositories;

import com.kalvinzhao.zoo.models.ZooAnimal;
import com.kalvinzhao.zoo.models.ZooAnimalId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, ZooAnimalId> {
}
