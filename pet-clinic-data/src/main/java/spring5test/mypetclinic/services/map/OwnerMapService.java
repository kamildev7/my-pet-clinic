package spring5test.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spring5test.mypetclinic.model.Owner;
import spring5test.mypetclinic.model.Pet;
import spring5test.mypetclinic.services.OwnerService;
import spring5test.mypetclinic.services.PetService;
import spring5test.mypetclinic.services.PetTypeService;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-06.
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        //test how it looks like without JPA, it will be refactor later
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());

                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    //TO-DO
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
