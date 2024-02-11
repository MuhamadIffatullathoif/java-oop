package org.iffat.object_classes;

public class Main extends Object {
    public static void main(String[] args) {
        Student student = new Student("Test", 20);
        System.out.println(student);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}