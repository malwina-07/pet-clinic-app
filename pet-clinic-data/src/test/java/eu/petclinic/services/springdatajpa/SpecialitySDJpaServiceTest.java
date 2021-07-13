package eu.petclinic.services.springdatajpa;

import eu.petclinic.model.Pet;
import eu.petclinic.model.Speciality;
import eu.petclinic.repositories.SpecialityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created by @author malwina.k on 13.07.2021
 */
@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialityRepository specialityRepository;

    @InjectMocks
    SpecialitySDJpaService service;

    Speciality speciality;

    @BeforeEach
    void setUp() {

        speciality = Speciality.builder().id(1L).build();
    }

    @Test
    void findById() {
        when(specialityRepository.findById(anyLong())).thenReturn(Optional.of(speciality));
        Speciality speciality = service.findById(1L);
        assertNotNull(speciality);
    }

    @Test
    void save() {

        Speciality specialityToSave = Speciality.builder().id(1L).build();
        when(specialityRepository.save(any())).thenReturn(this.speciality);
        Speciality specialitySaved = service.save(specialityToSave);

        assertNotNull(specialitySaved);
        verify(specialityRepository).save(any());


    }

    @Test
    void findAll() {
        Set<Speciality> returnSpeciality = new HashSet<>();
        returnSpeciality.add(Speciality.builder().id(1L).description("surgeon").build());
        returnSpeciality.add(Speciality.builder().id(2L).description("nurse").build());
        when(specialityRepository.findAll()).thenReturn(returnSpeciality);

        Set<Speciality> specialities = service.findAll();

        assertNotNull(specialities);
        assertEquals(2, specialities.size());


    }

    @Test
    void delete() {
        service.delete(speciality);
        verify(specialityRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        verify(specialityRepository).deleteById(anyLong());
    }
}