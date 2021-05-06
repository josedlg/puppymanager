package io.puppymanager.isthesiteup.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.puppymanager.isthesiteup.exception.UserNotFoundException;
import io.puppymanager.isthesiteup.modal.Puppy;
import io.puppymanager.isthesiteup.repo.PuppyRepo;

@Service
public class PuppyService {
    private final PuppyRepo puppyRepo;

    @Autowired
    public PuppyService(PuppyRepo puppyRepo){
        this.puppyRepo = puppyRepo;
    }

    public Puppy addPuppy(Puppy puppy){
    puppy.setPuppyCode(UUID.randomUUID().toString());
    return puppyRepo.save(puppy);
    }
    
    public List<Puppy> findAllPuppys(){
        return puppyRepo.findAll();

    }

    public Puppy updatePuppy(Puppy puppy){
        return puppyRepo.save(puppy);
    }

    public Puppy findPuppyById(Long id){
        return puppyRepo.findPuppyById(id).orElseThrow(() -> new UserNotFoundException ("User by id" + id + "was not found"));
    }

    public void deletePuppy(Long id){
        puppyRepo.deletePuppyById(id);
    }
}
