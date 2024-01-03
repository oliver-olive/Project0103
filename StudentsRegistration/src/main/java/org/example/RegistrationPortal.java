package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationPortal {

    private static List<Student> registeredStudents =  new ArrayList<>();
    private static RegistrationPortal instance;

    static RegistrationPortal getRegistrationPortal() {
        if(instance == null){
            instance = new RegistrationPortal();
        }
        return instance;
    }

    synchronized void register(Student student) {
        registeredStudents.add(student);
    }

     synchronized static List<Student> getRegisteredStudents() {
        return registeredStudents;
    }
}
