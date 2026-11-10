import java.util.*;

class Student {

    String regNo;
    String name;

    Student(String r, String n) {
        regNo = r;
        name = n;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return regNo.equals(s.regNo);
    }

    public int hashCode() {
        return regNo.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        set.add(new Student("101", "Arun"));
        set.add(new Student("102", "Divya"));
        set.add(new Student("101", "Arun"));

        System.out.println("Unique students: " + set.size());
    }
}