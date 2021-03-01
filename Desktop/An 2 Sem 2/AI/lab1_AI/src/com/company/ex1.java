package com.company;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {

        String str=ex1("Ana are mere rosii si galbene");
        System.out.println(str);
    }

    static public String ex1(String string){

        String[] splittedString = string.split(" ");
        String last=splittedString[0];
        for(String str: splittedString) {
            if (str.compareTo(last) > 0)
                last = str;
        }
        return last;
    }
}
