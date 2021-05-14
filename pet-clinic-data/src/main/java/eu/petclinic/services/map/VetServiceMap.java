package eu.petclinic.services.map;

import eu.petclinic.model.Vet;
import eu.petclinic.services.CrudService;

import java.util.Set;

/**
 * @project pet-clinic-app
 * Created by @author malwina.k on 14.05.2021
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
