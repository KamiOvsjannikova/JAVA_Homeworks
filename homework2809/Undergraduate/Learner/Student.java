package org.example.homework2809.Undergraduate.Learner;

// Создайте класс Студент, имеющий поля имя, фамилия и номер группы.
//1 Напишите минимум 2 конструктора для класса Студент.
//2 Реализуйте геттеры и сеттеры для класса Студент.
// В сеттере сделайте проверку, что номер группы положительный.
// В противном случае бросьте исключение throw new RuntimeException(“Номер группы должен быть положительным”);
//3 Создайте метод «перейти в следующую группу».
// При вызове метода студент переводится в следующую по номеру группу (чтобы не сдавать экзамены  ).
//4 Создайте в программе объект студента.
//5 Добавьте клонирующий конструктор к классу Студент.
// В программе склонируйте созданный ранее объект. Проверьте с помощью ==, что объекты имеют разные ссылки в памяти.
// Затем измените одно из полей оригинального студента. Изменилось ли то же поле у клона?

public class Student {
    String name;
    String lastName;
    int groupNumber;

    public Student(String name, String lastName, int groupNumber) { //konstruktor 1
        this.name = name;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
 }
    public Student (Student clone){ //clone konstructor2
        this(clone.name,clone.lastName, clone.getGroupNumber());
        this.groupNumber= clone.groupNumber ;
    }
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

    //proverka na polozitelnoe znach. grup

    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 0) {
            throw new RuntimeException("Group number must be positive");
        } else
            this.groupNumber = groupNumber;// esli nomer gruppi boljshe nulja, to peredajom vvedjonnuj nomer gruppi  i vivodim
    }
    public void increaseGroupNumber() {
        this.groupNumber++;
    }
}
