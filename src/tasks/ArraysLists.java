package tasks;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new tasks.Student("ausra", 30, 1));
        students.add(new tasks.Student("zuikis", 1, 5));
        students.add(new tasks.Student("batas", 2, 2));
        students.add(new tasks.Student("kumpis", 28, 10));
        students.add(new tasks.Student("bebras", 51, 6));

        System.out.println("__________ pilnas List<Student> students___________________");
        for (tasks.Student student : students) {
            System.out.println(student);
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 25) {
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println("__________ ištrintas elementas iš List<Student> students__________");
        for (tasks.Student student : students) {
            System.out.println(student);
        }
    }
}
