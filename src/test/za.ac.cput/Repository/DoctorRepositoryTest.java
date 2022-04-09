package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Doctor;
import za.ac.cput.factory.DoctorFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DoctorRepositoryTest {
    private static DoctorRepository repository = DoctorRepository.getRepository();
    private static Doctor doctor = DoctorFactory.createDoctor("Demi Greene","VeryCoolPassword_123","Nursing Department","Nurse Midwife");

    @Test
    void a_create(){
        Doctor created = repository.create((doctor));
        assertEquals(doctor.getDoctorId(),created.getDoctorId());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read(){
        Doctor read= repository.read(doctor.getDoctorId());
        assertNotNull(read);
        System.out.println("Read: "+ read);
    }
    @Test
    void c_update(){
        Doctor updated = new Doctor.Builder().copy(doctor)
                .setDoctorName("Demi Davids")
                .setDoctorPassword("KitKat_42")
                .setDepartmentName("Nursing Department")
                .setSpecialty("Pediatric Nurse")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }
    @Test
    void e_delete(){
        boolean success= repository.delete(doctor.getDoctorId());
        assertTrue(success);
        System.out.println("Delete: "+ success);

    }
    @Test
    void d_getAll(){
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}