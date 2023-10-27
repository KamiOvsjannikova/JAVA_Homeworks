package org.example.homework2210;


import java.util.Scanner;

public class ProductExampleApp {
    public static void main(String[] args) { // sozdaju novie product


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tech product name : ");
        String techname = scanner.next();
        TechProduct techProduct = new TechProduct();
        techProduct.setName(techname);


        System.out.println("Input food product name : ");
        String foodname = scanner.next();
        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setName(foodname);

        System.out.println("Input book product name : ");
        String bookname = scanner.next();
        BookProduct bookProduct = new BookProduct(bookname); // s pomowju konstruktora

        Truck truck = new Truck();
        // загрузка данных продуктов
        truck.addProductToTruck(techProduct);
        truck.addProductToTruck(foodProduct);
        truck.addProductToTruck(bookProduct);

        System.out.println("All Products in truck : ");
        truck.printAllProductsFromTruck();
        System.out.println("Tack is loaded and ready to go");

        Storage storage = new Storage();

        for (int i = 0; i < 5; i++) {
            Product product = truck.unloadProductsFromTruck();
            if (product == null) {
                break;
            }
            storage.addProductToTruck(product);
        }

        //razgruzka truck
        System.out.println("All products in storage : ");
        storage.printAllProductsFromStorage();
    }
}





