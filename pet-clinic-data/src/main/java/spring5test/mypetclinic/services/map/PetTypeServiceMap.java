package spring5test.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.PetType;
import spring5test.mypetclinic.services.PetTypeService;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-08.
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
