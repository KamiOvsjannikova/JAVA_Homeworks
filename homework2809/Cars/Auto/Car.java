//1 В созданном пакете создайте класс Автомобиль.
// Создайте поля для типа автомобиля – грузовик, спорткар, легковой (можно сделать перечисление), мощность двигателя (сколько лошадиных сил), поля для марки и модели автомобиля.
// Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными.
// Создайте объект этого класса в программе и попробуйте установить значения для полей.
// Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
//2 Создайте класс Завод.
// Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар, грузовик, легковой.
// В основной программе создайте несколько автомобилей с помощью класса Завод.
package org.example.homework2809.Cars.Auto;

public class Car { //создаю поля для характеристики машины
    public CarType type;
    private int power;
    private String mark;
    private String model;

    public Car(CarType type, int power, String mark, String model) { //создаю констуктор
        this.type = type;
        this.power = power;
        this.mark = mark;
        this.model = model;
    }
// вызываю setter and getter
    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {

        this.type = type;
    }

    public int getPower() {

        return power;
    }

    public void setPower(int power) {

        this.power = power;
    }

    public String getMark() {

        return mark;
    }

    public void setMark(String mark) {

        this.mark = mark;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }
}

