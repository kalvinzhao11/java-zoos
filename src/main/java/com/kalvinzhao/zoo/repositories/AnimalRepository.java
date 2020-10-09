package com.kalvinzhao.zoo.repositories;

import com.kalvinzhao.zoo.models.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT r.name name, count(menuid) countmenus " +  // name is name and countmenus is countmenus from MenuCounts in views
            "FROM zoos z JOIN animals n " +
            "ON r.restaurantid = m.restaurantid " +
            "GROUP BY r.name " +
            "ORDER by countmenus DESC", nativeQuery = true) //take this sql as it's written, want spring to send it to the database run it and bring back info
    List<MenuCounts> findMenuCounts();
}
