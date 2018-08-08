package spring5test.mypetclinic.model;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-05.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
