import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepo {

    Student student = new Student();
    public List<Student> fillRepo() {
        List<Student> students = new ArrayList<>();
        List<Double> grades = student.fillGrade();
        Student student1 = new Student("Юрий", grades, "Информатика");
        List<Double> grades1 = student.fillGrade();
        Student student2 = new Student("Андрей", grades1, "Химия");
        List<Double> grades2 = student.fillGrade();
        Student student3 = new Student("Евгений", grades2, "Информатика");
        List<Double> grades3 = student.fillGrade();
        Student student4 = new Student("Сергей", grades3, "Биология");
        List<Double> grades4 = student.fillGrade();
        Student student5 = new Student("Игорь", grades4, "Информатика");
        List<Double> grades5 = student.fillGrade();
        Student student6 = new Student("Иван", grades5, "Математика");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        return students;
    }
}
