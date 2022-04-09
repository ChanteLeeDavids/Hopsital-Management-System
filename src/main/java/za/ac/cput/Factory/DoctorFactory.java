/*  DoctorFactory.java
    Factory for the Doctor
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/

package za.ac.cput.Factory;

import za.ac.cput.Entity.Doctor;
import za.ac.cput.Util.Helper;

public class DoctorFactory {

    public static Doctor createDoctor(String doctorName, String doctorPassword,
                                      String departmentName,
                                      String specialty){

        String doctorId = Helper.generateDoctorId();
        if(Helper.isNullOrEmpty(doctorName) || Helper.isNullOrEmpty(departmentName) || Helper.isNullOrEmpty(specialty) || Helper.isNullOrEmpty(doctorPassword))
            return null;

        if(Helper.passwordValidation(doctorPassword))
            return null;

        return new Doctor.Builder().setDoctorId(doctorId)
                .setDoctorName(doctorName)
                .setDoctorPassword(doctorPassword)
                .setDepartmentName(departmentName)
                .setSpecialty(specialty)
                .build();
    }


}
