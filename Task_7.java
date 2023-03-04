import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Task_7 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        IntStream.iterate(0, i -> i < args.length - 1, i -> i + 2).forEachOrdered(i -> {
            String name = args[i];
            double gpa = Double.parseDouble(args[i + 1]);
            students.add(new Student(name, gpa));
        });
        students.sort(Comparator.comparing(Student::getGpa).reversed());
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        students.stream()
                .map(student -> student.getName() + " " + student.getGpa() + " ")
                .forEach(System.out::print);
    }

    public static class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
}
