import org.example.homework2809.Undergraduate.Learner.Student;

public class StudentCheck {
    public static void main(String[] args) {
        Student student = new Student("Max", "Login", 0);; //указываю студента

        student.setGroupNumber(-5);// номер группы передаю

        System.out.println("Student group number is: " + student.getGroupNumber());

        student.increaseGroupNumber();
        System.out.println("New group number is: " + student.getGroupNumber());

        Student studentClone = new Student(student);// новый объект студента клона
        System.out.println(student == studentClone);//проверка = ссылок

        System.out.println(student.getGroupNumber());
        System.out.println(studentClone.getGroupNumber());
    }
}
