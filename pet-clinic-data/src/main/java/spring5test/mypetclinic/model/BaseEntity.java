package spring5test.mypetclinic.model;

import java.io.Serializable;

/**
 * @author kamildev7 on 2018-08-06.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
