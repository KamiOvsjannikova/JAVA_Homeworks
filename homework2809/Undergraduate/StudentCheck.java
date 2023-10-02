import org.example.homework2809.Undergraduate.Learner.Student;

public class StudentCheck {
    public static void main(String[] args) {
        Student student = new Student("Max", "Login", 0);; //ukazivaju studenta

        student.setGroupNumber(-5);// peredaju nomer.gruppi

        System.out.println("Student group number is: " + student.getGroupNumber());

        student.increaseGroupNumber();
        System.out.println("New group number is: " + student.getGroupNumber());

        Student studentClone = new Student(student);//sozdaju nov.objekt i klon
        System.out.println(student == studentClone);//proverka = ssilok

        System.out.println(student.getGroupNumber());
        System.out.println(studentClone.getGroupNumber());
    }
}
