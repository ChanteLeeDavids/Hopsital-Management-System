/*  DepartmentFactoryTest.java
    Test for the DepartmentFactory
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Department;
import za.ac.cput.Util.Helper;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentFactoryTest{

    @Test
    public void test() {
        Department department = DepartmentFactory.createDepartment("Nursing Department", 145);
        System.out.println(department.toString());
        assertNotNull(department);
    }
}