package org.example.homeworks0510.company;
//№2 Создайте классы Сотрудник, Директор, Департамент и Организация. Создайте необходимые поля в каждом классе.
// Какие виды отношений будут между указанными классами?
public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private Double salary;

    public Employee(String firstName, String lastName, String position, Double salary) { //создаю конструктор
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    //создаю getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Position: " + position);
        System.out.println("Salary: EUR" + salary);
    }

}
