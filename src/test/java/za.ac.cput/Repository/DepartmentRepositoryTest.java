package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Department;
import za.ac.cput.Factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DepartmentRepositoryTest {
    private static DepartmentRepository repository = DepartmentRepository.getRepository();
    private static Department department = DepartmentFactory.createDepartment("Nursing Department", 145);

    @Test
    void a_create(){
        Department created = repository.create((department));
        assertEquals(department.getDepartmentId(),created.getDepartmentId());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read(){
        Department read = repository.read(department.getDepartmentId());
        assertNotNull(read);
        System.out.println("Read: "+ read);
    }
    @Test
    void c_update(){
        Department updated = new Department.Builder().copy(department)
                .setDepartmentName("Nursing Department")
                .setDepartmentSize(145)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }
    @Test
    void e_delete(){
        boolean success = repository.delete(department.getDepartmentId());
        assertTrue(success);
        System.out.println("Delete: "+ success);

    }
    @Test
    void d_getAll(){
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}