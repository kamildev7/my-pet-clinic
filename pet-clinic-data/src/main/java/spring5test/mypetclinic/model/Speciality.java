package spring5test.mypetclinic.model;

/**
 * @author kamildev7 on 2018-08-08.
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
