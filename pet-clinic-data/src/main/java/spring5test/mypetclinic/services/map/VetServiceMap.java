package spring5test.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Vet;
import spring5test.mypetclinic.services.VetService;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
