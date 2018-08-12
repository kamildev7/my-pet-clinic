package spring5test.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring5test.mypetclinic.model.Owner;

/**
 * @author kamildev7 on 2018-08-12.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
