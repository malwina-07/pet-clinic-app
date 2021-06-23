package eu.petclinic.repositories;

import eu.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author malwina.k on 23.06.2021
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
