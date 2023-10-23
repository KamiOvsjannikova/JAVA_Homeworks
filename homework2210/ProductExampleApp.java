package org.example.homework2210;



public class ProductExampleApp {
    public static void main(String[] args) { // sozdaju novie product
        TechProduct techProduct = new TechProduct("Keyboard"); // ключик к нужному классу, чтобы понимать программе куда обращаться
        FoodProduct foodProduct = new FoodProduct("Dairy product");
        BookProduct bookProduct = new BookProduct("Detectives");

        Truck truck = new Truck();
        // загрузка данных продуктов
        truck.addProduct(techProduct);
        truck.addProduct(foodProduct);
        truck.addProduct(bookProduct);

        Storage storage = new Storage();
        //Выгрузить все продукты из трака, сообщить об этом и вывести список продуктов в траке и на складе.

    }
}
