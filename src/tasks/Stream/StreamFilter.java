package tasks.Stream;

import tasks.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("ausra", 30, 1));
        students.add(new Student("zuikis", 1, 5));
        students.add(new Student("Petras", 2, 2));
        students.add(new Student("kumpis", 28, 10));
        students.add(new Student("zmogus", 30, 15));

//        List<Student> students = Arrays.asList(new Student("ausra", 30, 1), new Student("zuikis", 1, 5), new Student("Petras", 2, 2), new Student("kumpis", 28, 10), new Student("zmogus", 30, 15));

        System.out.println("______________________________________");
        students.stream().forEach(student -> student.setGrade(10));

        for (Student student : students) {
            System.out.println(student);
        }

        List<Student> notPetras = students.stream()
                .filter(student -> student.getName() != "Petras")
                .toList();

        System.out.println();

        for (Student student : notPetras) {
            System.out.println(student);
        }
    }
}
