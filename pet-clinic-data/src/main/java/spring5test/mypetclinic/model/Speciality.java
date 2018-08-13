package spring5test.mypetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author kamildev7 on 2018-08-08.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "speciality")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
