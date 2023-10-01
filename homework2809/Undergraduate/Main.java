package org.example.homework2809.Undergraduate;

import org.example.homework2809.Undergraduate.Learner.Student;

public class Main {
    public static void main(String[] args) {
        // Создаю объект студента
        Student student = new Student ("Max", "Login", 0);

        // Переход в следующую группу
        student.goToNextGroup();

        // Вывожу инфо о студенте
        System.out.println("Name: " + student.getName());
        System.out.println("Lastname: " + student.getLastName());
        System.out.println("Number of group: " + student.getGroupNumber());
    }
}





