package org.example.homework2210;
//        Создается объект truck, на основе класса Truck, который будет отвечать за перевозку данных продуктов
//        до склада, у данного класса должна быть переменная - массив, в которую нужно добавить все созданные
//        продукты.
public class Truck {

    private Product[] products = new Product[5];   // создаю массив xranit massiv, kot pomewaem product
    //ukazatj razmernostj massiva new Product[5]
    //dobovlaem index massiva
    private int productCount = 0;
    //metod dobavlatj massiv метод добавления продуктов, должен быть публичным. Вывожу, что гурзовик полный и нельзя дальше заполнять
    public void addProductToTruck(Product product) {
        products[productCount] = product;
            productCount++; // na edinichku vpered
    }

    public void printAllProductsFromTruck() { // obxod elementov massiva i vivodit ix v sout
       for (int i = 0; i < productCount; i++) { // for (int i = 0; i < products.length; i++) { // vesj massiv vivodit
            System.out.println("Product = " + products[i]);
        }
    }
//vigruzka po odnomu elementu
    public Product unloadProductsFromTruck() {
        //proverka elementov, est li v massive
        if (productCount == 0){
            System.out.println("Truck is empty");
            return null;
        }
        Product currentProduct = products[productCount-1]; //-1 potomy chto s 0
        products[productCount-1] = null; // udalitj iz massiva , snachala prisvoitj znachenie
        productCount--;

        return currentProduct;
    }
//    public Product[] unloadAllProductsFromTruck() {
//    }
}

