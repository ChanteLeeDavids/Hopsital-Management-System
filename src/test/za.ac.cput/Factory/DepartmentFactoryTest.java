package za.ac.cput.Repository;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentFactoryTest{

    @Test
    public void test() {
        Department department = DepartmentFactory.createDepartment("Nursing Department", 145);
        System.out.println(department.toString());
        assertNotNull(department);
    }
}