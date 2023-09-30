package org.example.example_28_09;

public class Main {
        public static void main(String[] args) {

            Student student = new Student("Max", "Kuzmin", 7);//объект студента

            student.goToTheNextGroup(); //переход в след.группу

            System.out.println("Name: " + student.getName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Group Number " + student.getGroupNumber());
        }
    }


