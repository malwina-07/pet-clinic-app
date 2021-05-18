package eu.petclinic.services.map;

import eu.petclinic.model.Speciality;
import eu.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by @author malwina.k on 18.05.2021
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }


    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
