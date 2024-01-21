package org.example.homework120124;

public class StringPredicate implements Predicate<Product>  {
    private String field;
    private String value;

    public StringPredicate(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public boolean test(Product product) {
        switch (field) {
            case "type":
                return product.getType().equals(value);
            case "color":
                return product.getColor().equals(value);
            case "flavour":
                return product.getFlavour().equals(value);
            case "size":
                return product.getSize().equals(value);
            default:
                return false;
        }
    }
    //opredeljaju method test
    public StringPredicate and (StringPredicate other) {
        return (Product product) -> this.test() && other.test();
    }
}




