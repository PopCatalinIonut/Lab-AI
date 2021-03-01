package com.company;

import java.lang.constant.Constable;
import java.util.*;

public class ex5 {


    public static void main(String[] args) {

        int res = twice(Arrays.asList(1,2,3,4,2));
        System.out.println(res);
    }


    static public int twice(List<Integer> list){

        Map<Integer,Integer> index= new HashMap<>();
        for(int el: list)
            index.merge(el, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> entry : index.entrySet())
            if(entry.getValue()==2)
                return entry.getValue();

        return 0;
    }
}
