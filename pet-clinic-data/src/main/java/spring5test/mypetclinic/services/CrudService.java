package spring5test.mypetclinic.services;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
