package spring5test.mypetclinic.services;

import spring5test.mypetclinic.model.Owner;

/**
 * @author kamildev7 on 2018-08-06.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
