package tasks.Stream;

import tasks.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task11 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList();
        students.add(new Student("ausra", 30, 1));
        students.add(new Student("zuikis", 1, 5));
        students.add(new Student("Petras", 2, 2));
        students.add(new Student("kumpis", 28, 10));
        students.add(new Student("zmogus", 30, 15));

        System.out.println(students);

        List<Student> sorted = students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .toList();

        System.out.println(sorted);

        Optional<Student> minAgeStudent = students.stream().min(Comparator.comparingInt(Student::getAge));
        System.out.println(minAgeStudent.get());

        Optional<Student> maxAgeStudent = students.stream().max(Comparator.comparingInt(Student::getAge));
        System.out.println(maxAgeStudent.get());

    }
}
