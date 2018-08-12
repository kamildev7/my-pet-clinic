package spring5test.mypetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Vet;
import spring5test.mypetclinic.repositories.VetRepository;
import spring5test.mypetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kamildev7 on 2018-08-12.
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaServiceImpl implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets= new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
