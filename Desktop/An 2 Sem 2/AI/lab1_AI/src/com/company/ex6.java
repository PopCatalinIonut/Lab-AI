package com.company;

import java.lang.constant.Constable;
import java.util.*;

public class ex6 {


    public static void main(String[] args) {

        int res = most(Arrays.asList(2,8,7,2,2,5,2,3,1,2,2));
        System.out.println(res);
    }


    static public int most(List<Integer> list){

        Map<Integer,Integer> index= new HashMap<>();
        for(int el: list)
            index.merge(el, 1, Integer::sum);

        int maximum=0;
        for (Map.Entry<Integer, Integer> entry : index.entrySet())
            if(entry.getValue()>list.size()/2)
                maximum=entry.getValue();

        return maximum;
    }
}
