package org.example.homeworks0510.company;

public class Main {
    public static void main(String[] args) {

        //создаю новых дикреторов, сотрудников, организацию, департамент

        Employee employee1 = new Employee("Aldis", "Cigis", "Manager", 2000.00);
        // вывожу инфо о Employee
        System.out.println("Employee: " + employee1.getFirstName());
        System.out.println("Employee: " + employee1.getLastName());
        System.out.println("Employee: " + employee1.getPosition());
        System.out.println("Employee: " + employee1.getSalary());



        Director director1 = new Director("Adriana","Fuks", "Principal", 7000.00, 5);
        // вывожу инфо о Director
        System.out.println("Director: " + director1.getFirstName());
        System.out.println("Director: " + director1.getLastName());
        System.out.println("Director: " + director1.getPosition());
        System.out.println("Director: " + director1.getSalary());
        System.out.println("Director: " + director1.getAccessLevel());


        Department department1 = new Department("Sales");
        // вывожу инфо о Department
        System.out.println("Department: " + department1.getName());
        System.out.println("Department: " + department1.getEmployeeName());



        Organization organization = new Organization("Company OkMa","Sales");
        // вывожу инфо о Organization
        System.out.println("Organization: " + organization.getOrgName());
        System.out.println("Organization: " + organization.getDepName());

    }
}

