package org.example.homework120124;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchEngine {
 public static void main(String[] args) {
//        //Predicate inerfejs dla filtracii, kogda mne nuzno vkl. neskolko opcij dla poiska
//
//        Predicate<String> stringPredicate1 = s -> s.startsWith("S");
//        Predicate<String> stringPredicate2 = s -> s.contains("k"); // vkl.v sebja bukvu K
//        //find sting nazin s bukvi S i soderzit bukvu K
//        //boolean  hello = stringPredicate1.and(stringPredicate2).test("Hello"); // proverka sozderzit bukvu K i naznit na S, esli soderzit, to budet true
//        boolean result1  = stringPredicate1.and(stringPredicate2).test("Hello"); // proverka sozderzit bukvu K i naznit na S, esli soderzit, to budet true
//        System.out.println(result1);
//
//        boolean result2 =  stringPredicate1.and(stringPredicate2).test("Skate");// proverka sozderzit bukvu K i naznit na S, esli soderzit, to budet true
//        System.out.println(result2); // tut budet true

//Сделать работу поисковой машины, шаблон для поисковой машины запушен на гитхаб, пояснение, как делать в видео - в конце урока
        Product jeans = new Product("Jeans");
        jeans.setType("Model");
        jeans.setColor("White");
        jeans.setFlavour("Strawberry");
        jeans.setSize("M");
        //5 product -> to ArrayList
        List<Product> products = new ArrayList<>();
        products.add(jeans);

        StringPredicate colorFilter = new StringPredicate("color", "White");
        StringPredicate sizeFilter = new StringPredicate("size", "L");
        //and

         List<Product> filteredProducts = filterProducts(products, colorFilter.and(sizeFilter));
        //List<Product> filteredProducts = Products(productList,colorFilter.and(sizeFilter));

        // vivozu rezults
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
}
    // sozdaju method dlja filtracii
    private static List<Product> filterProducts(List<Product> products, StringPredicate predicate) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                result.add(product);
            }
        }
        return result;
    }
}


