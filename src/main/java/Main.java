import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        Student student = new Student();
        student.setName("Oscar Calero");
        student.setId(12345L);
        student.setMajor("Ing.Sistemas");
        dao.save(student);

    }
}
