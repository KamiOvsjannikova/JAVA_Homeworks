package org.example.homework2210;

public class BookProduct extends Product {
    //delaem konctructor
    public BookProduct(String name) { //prinimaet srazu imja
        //super() - constructor from parent
        //super.someMethod() - method from parent variable from parent class - orawenie k method ili peremennoj
        //super.name - call
        super(name); // call constructor from parent class
    }

    @Override
    public String toString() {
        return "Book Product :  name = " + getName();
    }
}
