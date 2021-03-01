package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex7 {

    public static void main(String[] args) {

        int res= kElem(Arrays.asList(7,4,6,3,9,1),2);
        System.out.println(res);
    }

    static int kElem(List<Integer> list, int k){

        Collections.sort(list);
        return list.get(list.size()-k);
    }
}
