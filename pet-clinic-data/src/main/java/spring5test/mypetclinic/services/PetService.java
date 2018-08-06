package spring5test.mypetclinic.services;

import spring5test.mypetclinic.model.Pet;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
