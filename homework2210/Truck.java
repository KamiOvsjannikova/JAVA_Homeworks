package org.example.homework2210;
//        Создается объект truck, на основе класса Truck, который будет отвечать за перевозку данных продуктов
//        до склада, у данного класса должна быть переменная - массив, в которую нужно добавить все созданные
//        продукты.
public class Truck {

    private Product[] products;   // создаю массив
    private int productCount;
    private static final int MAX_CAPACITY = 10; // объем регулирую финальное значение



    public boolean isFull() {
        return productCount >= MAX_CAPACITY; // если больше или = 10, то грузовик полный
    }

    //метод добавления продуктов, должен быть публичным. Вывожу, что гурзовик полный и нельзя дальше заполнять
    public void addProduct(Product product) {

    }

    // метод выгрузки грузовика, должен быть публичным
    public void unloadAllProducts() {

    }
}

