package spring5test.mypetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Pet;
import spring5test.mypetclinic.repositories.PetRepository;
import spring5test.mypetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kamildev7 on 2018-08-12.
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
