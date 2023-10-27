package org.example.homework2210;
 //Создайте объект типа Storage - это склад, в котором будут храниться разгруженные продукты,
//        хранить продукты можно по аналогии с переменной хранения в траке
//        Выгрузить все продукты из трака, сообщить об этом и вывести список продуктов в траке и на складе.
public class Storage {
  private Product[] products = new Product[5]; // создаю массив
  private int productCount =0;

     public void addProductToTruck(Product product) {
         products[productCount] = product;
         productCount++; // na edinichku vpered
     }

     public void printAllProductsFromStorage() { // obxod elementov massiva i vivodit ix v sout
         for (int i = 0; i < productCount; i++) { // for (int i = 0; i < products.length; i++) { // vesj massiv vivodit
             System.out.println("Product = " + products[i]);
         }
     }


 }

