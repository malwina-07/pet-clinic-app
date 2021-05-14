package eu.petclinic.services.map;

import eu.petclinic.model.Owner;
import eu.petclinic.services.CrudService;

import java.util.Set;

/**
 * @project pet-clinic-app
 * Created by @author malwina.k on 14.05.2021
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
