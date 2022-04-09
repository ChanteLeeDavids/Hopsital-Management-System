package za.ac.cput.Util;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s){
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static String generateDoctorId(){
        return UUID.randomUUID().toString();
    }

    public static String generateDepartmentId(){
        return UUID.randomUUID().toString();
    }
}
