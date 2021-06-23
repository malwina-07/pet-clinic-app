package eu.petclinic.repositories;

import eu.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author malwina.k on 23.06.2021
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
