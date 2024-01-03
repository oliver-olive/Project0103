package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       int threadCount = 3;
       int[] studentCount = {3, 2, 3};
       Thread[] threads = new Thread[threadCount];
       for(int i = 0; i < threadCount; i ++){
           final int threadNumber = i + 1;
           Runnable r1 = () -> {
               RegistrationPortal portal = RegistrationPortal.getRegistrationPortal();
               for (int j = 1; j <= studentCount[threadNumber - 1]; j++) {
                   Student student = new Student( "id-" + threadNumber + "-" + j   + " name-" + threadNumber);
                   portal.register(student);
               }
           };
           threads[i] = new Thread(r1);
       }

       for(Thread t: threads){
           t.start();
       }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RegistrationPortal portal = RegistrationPortal.getRegistrationPortal();
        List<Student> registeredStudents = portal.getRegisteredStudents();

        for (Student student : registeredStudents) {
            System.out.println(student.toString());
        }
    }
}