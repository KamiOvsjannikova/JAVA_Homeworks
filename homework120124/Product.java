package org.example.homework120124;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private String color;
    private String type;
    private String flavour;
    private String size;

    private Map<String, String> properties = new HashMap<>();

    public Product(String name) {
        this.name = name;
    }

    public void setColor(String color) { // stroka v kotor. peredajem color
        properties.put("color", color); // t.k. color soderzitjsa v private Map<String,String> properties = new HashMap<>();
    }
    public void setType(String type) {
        properties.put("type", type);

    }
    public void setFlavour(String flavour) {
        properties.put("flavour", flavour);

    }
    public void setSize(String size) {
        properties.put("size", size);

    }

    // podgotavlibaju get dla togo chto mozno bilo lamba viroz ispolzovatj
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public String getFlavour() {
        return flavour;
    }
    public String getSize() {
        return size;
    }
}




