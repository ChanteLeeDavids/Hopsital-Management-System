package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Doctor;

import static org.junit.jupiter.api.Assertions.*;

class DoctorFactoryTest{

    @Test
    public void test(){

        Doctor doctor = DoctorFactory.createDoctor("Chante Davids", "cps123","Nursing Department","Nurse Midwife");
        System.out.println(doctor.toString());
        assertNotNull(doctor);

    }
}