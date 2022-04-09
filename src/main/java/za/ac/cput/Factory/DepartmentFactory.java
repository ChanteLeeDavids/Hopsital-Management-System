/*  DepartmentFactory.java
    Factory for the Department
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/

package za.ac.cput.Factory;

import za.ac.cput.Entity.Department;
import za.ac.cput.Util.Helper;

public class DepartmentFactory {
    public static Department createDepartment(String departmentName, int departmentSize){

    String departmentId = Helper.generateDepartmentId();
        if(Helper.isNullOrEmpty(departmentName) || Helper.isNullOrEmpty(String.valueOf(departmentSize)))
            return null;

        return new Department.Builder().setDepartmentId(departmentId)
                .setDepartmentName(departmentName)
                .setDepartmentSize(departmentSize)
                .build();
    }
}
