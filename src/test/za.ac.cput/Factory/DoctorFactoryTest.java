package za.ac.cput.Repository;

import static org.junit.jupiter.api.Assertions.*;

class DoctorFactoryTest{
    @Test
    public void test(){

        Doctor doctor = DoctorFactory.createDoctor("Chante Davids", "cps","Nursing Department","Nurse Midwife");
        System.out.println(doctor.toString());
        assertNotNull(doctor);

    }
}