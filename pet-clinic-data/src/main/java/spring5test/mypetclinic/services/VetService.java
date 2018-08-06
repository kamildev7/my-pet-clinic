package spring5test.mypetclinic.services;

import spring5test.mypetclinic.model.Vet;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
