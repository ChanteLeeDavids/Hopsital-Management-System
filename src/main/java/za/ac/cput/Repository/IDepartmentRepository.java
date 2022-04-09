package za.ac.cput.Repository;

import za.ac.cput.Entity.Department;

import java.util.Set;

public interface IDepartmentRepository extends IRepository<Department, String>{
    //create, read, update, delete

    Department create(Department department);
    Department read(String doctorId);
    public Set<Department> getAll();
}

