package spring5test.mypetclinic.model;

import java.util.Set;

/**
 * @author kamildev7 on 2018-08-05.
 */
public class Vet extends Person {
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
