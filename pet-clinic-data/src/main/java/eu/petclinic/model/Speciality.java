package eu.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by @author malwina.k on 18.05.2021
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{
    @Builder
    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    @Column(name = "description")
    private String description;

}
