package org.example.example_28_09;

public class Student { // создала класс студент
    //ниже создаю поля к нему
    private String name;
    private String lastName;
    private int groupNumber;

    // создаю конструктор
    public Student(String name, String lastName, int groupNumber) {
        this.name = name;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

   //создаю второй конструктор
    public Student() {
        this.name = "";
        this.lastName = "";
        this.groupNumber = 0;
    }
    // создаю setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    //setter на проверку, что номер группы положительный
    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0) {
            throw new RuntimeException("Номер группы должен быть положительным");
        }
        this.groupNumber = groupNumber;
    }
    public void goToTheNextGroup() {
        groupNumber++;
    }


    //Клонирующий конструктор
    public Student(Student otherStudent) {
        this.name = otherStudent.getName();
        this.lastName = otherStudent.getLastName();
        this.groupNumber = otherStudent.getGroupNumber();
    }
}
