package spring5test.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Speciality;
import spring5test.mypetclinic.services.SpecialityService;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-08.
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
