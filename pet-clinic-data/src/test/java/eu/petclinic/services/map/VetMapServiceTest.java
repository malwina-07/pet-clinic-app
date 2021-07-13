package eu.petclinic.services.map;

import eu.petclinic.model.Owner;
import eu.petclinic.model.Speciality;
import eu.petclinic.model.Vet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by @author malwina.k on 28.06.2021
 */
class VetMapServiceTest {
    VetMapService vetMapService;
    Long vetId = 1L;
    String surgeon = "vet_surgeon";


    @BeforeEach
    void setUp() {
        Set<Speciality> specialities = new HashSet<>();
        specialities.add(Speciality.builder().description(surgeon).build());


        vetMapService = new VetMapService(new SpecialityMapService());

        vetMapService.save(Vet.builder().specialities(specialities).id(vetId).build());
    }

    @Test
    void findAll() {
        Set<Vet> vets = vetMapService.findAll();
        assertEquals(1,vets.size());
    }

    @Test
    void findById() {
        Vet vet = vetMapService.findById(vetId);
        assertEquals(vetId, vet.getId());
    }

    @Test
    void save() {

//        Long id = 2L;
//        Vet vet2 = Vet.builder().id(id).build();
//        Vet savedVet = vetMapService.save(vet2);
//        assertEquals(id, savedVet.getId());

    }
    @Test
    void saveNoId() {

    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}