package org.example.homework2210;

//С консоли вводится три наименования продукта,
//        на основе наименований, создаются продукты трех различных типов (TechProduct,FoodProduct,BookProduct)
//        Создается объект truck, на основе класса Truck, который будет отвечать за перевозку данных продуктов
//        до склада, у данного класса должна быть переменная - массив, в которую нужно добавить все созданные
//        продукты.
//        Так как продукты трех различных типов, то собрать их вместе мы можем только в массиве, который будет
//        иметь общий тип данных для всех - Product
//        Так как придерживаемся принципа инкапсуляции, то доступ к переменной, в которой храним продукты,
//        тоже сделать через отдельный метод.
//        Давайте под итожим:
//        На данном этапе должно быть создано четыре объекта: Объекты типов TechProduct,FoodProduct,BookProduct и
//        объект типа Truck, в который нужно поместить вышеуказанные объекты.
//        Необходимо загрузить трак продуктами и сообщить об этом.
//        Создайте объект типа Storage - это склад, в котором будут храниться разгруженные продукты,
//        хранить продукты можно по аналогии с переменной хранения в траке
//        Выгрузить все продукты из трака, сообщить об этом и вывести список продуктов в траке и на складе.
//        Задание со * :
//        Добавьте возможность ввести с консоли тип трака - "Big,Medium,Small"
//        В зависимости от введенного типа, создавайте траки разных классов !!!
//        Но при этом основной код разгрузки и загрузки не должен меняться(Полиморфизм и работа с общими типами)) )
//        */

public class Product {
    private String name; //создаю поле для характеристики product


    // вызываю setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
