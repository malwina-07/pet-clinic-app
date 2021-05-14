package eu.petclinic.services.map;

import eu.petclinic.model.Pet;
import eu.petclinic.services.CrudService;

import java.util.Set;

/**
 * @project pet-clinic-app
 * Created by @author malwina.k on 14.05.2021
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
