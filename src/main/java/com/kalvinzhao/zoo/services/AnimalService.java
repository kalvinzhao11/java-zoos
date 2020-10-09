package com.kalvinzhao.zoo.services;

import com.kalvinzhao.zoo.models.Animal;
import com.kalvinzhao.zoo.views.AnimalCount;

import java.util.List;

public interface AnimalService {
    List<AnimalCount> findAll();
}
