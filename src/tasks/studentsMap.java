package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentsMap {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("ausra", 30, 1));
        students.add(new Student("zuikis", 1, 5));
        students.add(new Student("batas", 2, 2));
        students.add(new Student("kumpis", 28, 10));
        students.add(new Student("zmogus", 22, 15));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("_____________________________________________");

        Map<Integer, Student> studentsMap = new HashMap<>();

//        for (int i = 0; i < students.size(); i++) {
//            studentsMap.put(students.get(i).getId(), students.get(i));
//        }

        for (Student student : students) {
            studentsMap.put(student.getId(), student);
        }

        //Take 4 index tasks.Student and change his grade and age.
        studentsMap.get(4).setGrade(100);
        studentsMap.get(4).setAge(100);

        for (Map.Entry<Integer, Student> student : studentsMap.entrySet()) {
            System.out.println(student.getKey() + " " + student);
        }
    }
}
