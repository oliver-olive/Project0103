package org.example;

public class Student {
    private static int idCount = 0;
    String name;
    int id;

    public Student( String name) {
        this.idCount ++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
