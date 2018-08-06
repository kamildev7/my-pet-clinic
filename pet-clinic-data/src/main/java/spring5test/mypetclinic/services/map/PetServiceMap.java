package spring5test.mypetclinic.services.map;

import spring5test.mypetclinic.model.Pet;
import spring5test.mypetclinic.services.PetService;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
