package spring5test.mypetclinic.services;

import spring5test.mypetclinic.model.Owner;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
