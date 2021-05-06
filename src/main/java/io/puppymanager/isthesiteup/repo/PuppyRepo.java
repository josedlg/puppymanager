package io.puppymanager.isthesiteup.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import io.puppymanager.isthesiteup.modal.Puppy;


public interface PuppyRepo extends  JpaRepository<Puppy, Long> {

    void deletePuppyById(Long id);

    Optional <Puppy> findPuppyById(Long id);
    
}
