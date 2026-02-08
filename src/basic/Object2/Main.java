package basic.Object2;

class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    class Student extends Person {
        Student(String name){
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("ひとみん");
        System.out.println(s.name);
    }
}