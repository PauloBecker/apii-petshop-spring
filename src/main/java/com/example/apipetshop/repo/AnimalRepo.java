package com.example.apipetshop.repo;

import com.example.apipetshop.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimalRepo extends JpaRepository<Animal, Long> {

    Optional<Animal> findAnimalById(Long id);

    void deleteAnimalById(Long id);


}
