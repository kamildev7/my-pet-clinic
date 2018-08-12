package spring5test.mypetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Owner;
import spring5test.mypetclinic.repositories.OwnerRepository;
import spring5test.mypetclinic.repositories.PetRepository;
import spring5test.mypetclinic.repositories.PetTypeRepository;
import spring5test.mypetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kamildev7 on 2018-08-12.
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaServiceImpl(OwnerRepository ownerRepository, PetRepository petRepository,
                                 PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
