/*  Helper.java
    Helper class for the Factory classes
    Author: Chante Lee Davids [220246688]
    Date  : 6 April 2022
*/

package za.ac.cput.Util;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s){
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static boolean passwordValidation(String s) {
        return(s.matches(".*[0-9]{1,}.*") && s.matches(".*[@#_*$]{1,}.*")
                && s.length() >=6 && s.length()<=20);
    }

    public static String generateDoctorId(){
        return UUID.randomUUID().toString();
    }

    public static String generateDepartmentId(){
        return UUID.randomUUID().toString();
    }
}
