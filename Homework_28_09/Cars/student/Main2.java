package org.example.example_28_09;

public class Main2 {
        public static void main(String[] args) {
            // создаю оригинальный объект студента
            Student originalStudent = new Student("Karina", "Wang", 101);

            // Клонирую объект
            Student clonedStudent = new Student(originalStudent);

            //  равенство ссылок
            System.out.println("Оригинальный объект и клон имеют разные ссылки: " + (originalStudent != clonedStudent));

            // Изменяем одно из полей оригинального студента
            originalStudent.setGroupNumber(102);

            // Проверяем, изменилось ли поле у клона
            System.out.println("Номер группы оригинального объекта: " + originalStudent.getGroupNumber());
            System.out.println("Номер группы клонированного объекта: " + clonedStudent.getGroupNumber());
        }
    }

