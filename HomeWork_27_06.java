package org.example;

public class HomeWork_27_06 {
    public static void main(String[] args) {

            String myStr = new String("I study Basic Java!");
            System.out.println(myStr);
            System.out.println(myStr.charAt(myStr.length() - 2));

            System.out.println(myStr.contains("Java"));
            System.out.println("I study Basic Java!".substring(0, 13));
            System.out.println(myStr.replace("a", "o"));
            System.out.println(myStr.toUpperCase());
            System.out.println(myStr.toLowerCase());
        }
    }

