package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortinimas {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("ausra", 30, 1));
        students.add(new Student("zuikis", 1, 5));
        students.add(new Student("Petras", 2, 2));
        students.add(new Student("kumpis", 28, 10));
        students.add(new Student("zmogus", 30, 15));

        Collections.sort(students, new AgeComparator().reversed());
//        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
