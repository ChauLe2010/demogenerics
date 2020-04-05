package interfacegeneric;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Linh",90);
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.insert(student);
        Teacher teacher=new Teacher("Hoa",1000);
        TeacherDAO teacherDAO=new TeacherDAO();
        teacherDAO.insert(teacher);
    }
}
