/*  IDepartmentRepository.java
    Interface for the DepartmentRepository
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Entity.Department;

import java.util.Set;

public interface IDepartmentRepository extends IRepository<Department, String>{
    //create, read, update, delete

    Department create(Department department);
    Department read(String doctorId);
    public Set<Department> getAll();
}

