import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepo studentRepo = new StudentRepo();
        List<Student> students = studentRepo.fillRepo();
        System.out.println(students);
        List<Student> as = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика"))
                .filter(student -> student.getGrades().stream().reduce(Double::sum).get()/student.getGrades().size()>4.5)
                .sorted(Comparator.comparingDouble(student -> student.getGrades().stream().reduce(Double::sum).get()/student.getGrades().size()))
                .toList();

        System.out.println(as);
    }
}
