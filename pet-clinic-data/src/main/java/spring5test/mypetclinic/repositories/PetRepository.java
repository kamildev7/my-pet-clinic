package spring5test.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5test.mypetclinic.model.Pet;

/**
 * @author kamildev7 on 2018-08-12.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}