package za.ac.cput.Repository;

import za.ac.cput.Entity.Doctor;

import java.util.Set;

public interface IDoctorRepository extends IRepository<Doctor, String>{
    //create, read, update, delete
    Doctor create(Doctor doctor);
    Doctor read(String doctorId);
    public Set<Doctor> getAll();
}