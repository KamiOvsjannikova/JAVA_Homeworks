package org.example.homework020224;

import java.util.regex.Pattern;

//Напишите регулярное выражение, которое соответствует любому номеру телефона.
//        Телефонный номер состоит из 7 цифр подряд, или из 3х цифр, пробела или тире, а затем из 4 цифры.
//        Правильные номера :
//        1234567, 123 4567, 123-4567
public class NumberChecker {
    private  String phonePattern = "\\d{3}[-\\s]?\\d{4}|\\d{7}";

    public NumberChecker(String phonePattern) {
        this.phonePattern = phonePattern;
    }

    public boolean isCorrectNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(phonePattern);
        return pattern.matcher(phonePattern).matches();
    }
}
