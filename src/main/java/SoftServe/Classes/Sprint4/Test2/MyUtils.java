package SoftServe.Classes.Sprint4.Test2;

import java.util.*;

public class MyUtils {
    // Code
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return getId() == student.getId() && getName().equals(student.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> result = new HashSet<>();
        for (Student student : list1) {
            if(list2.contains(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1, "Ivan"));
        list1.add(new Student(2,"Petro"));
        list1.add(new Student(3,"Stepan"));

        list2.add(new Student(1, "Ivan"));
        list2.add(new Student(4,"Andriy"));
        list2.add(new Student(3,"Stepan"));

        System.out.println(new MyUtils().commonStudents(list1, list2));
    }

}