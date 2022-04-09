/*  DoctorFactoryTest.java
    Test for the DoctorFactory
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Doctor;
import za.ac.cput.Util.Helper;
import static org.junit.jupiter.api.Assertions.*;

class DoctorFactoryTest{

    @Test
    public void test(){

        Doctor doctor = DoctorFactory.createDoctor("Chante Davids", "KitKat_42","Nursing Department","Midwife Nurse");
        System.out.println(doctor.toString());
        assertNotNull(doctor);
    }

    @Test
    public void checkPassword(){
        boolean validPassword = Helper.passwordValidation("KitKat_42");
        System.out.println(validPassword);
    }
}