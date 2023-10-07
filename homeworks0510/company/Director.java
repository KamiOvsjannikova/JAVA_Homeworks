package org.example.homeworks0510.company;

public class Director extends Employee { //наследую от класса Employee
    private int accessLevel; // указываю уровень доступа

    public Director(String firstName, String lastName, String position, Double salary, int accessLevel) {
        super(firstName, lastName, position, salary);
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}
