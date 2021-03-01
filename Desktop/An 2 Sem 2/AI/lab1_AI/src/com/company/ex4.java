package com.company;

import java.util.*;

public class ex4 {

    public static void main(String[] args) {


        List<String> res = once( "ana are ana are mere rosii ana");
        res.forEach(System.out::println);
    }

    static public List<String> once(String str){

        Map<String,Integer> index= new HashMap<>();
        String[] splitted= str.split(" ");
        for(String word: splitted)
            index.merge(word, 1, Integer::sum);

        List<String> wordList= new ArrayList<>();
        for (Map.Entry<String, Integer> entry : index.entrySet())
            if(entry.getValue()==1)
                wordList.add(entry.getKey());

        return wordList;
    }

}
