package com.kalvinzhao.zoo.repositories;

import com.kalvinzhao.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
