package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex3 {

    public static void main(String[] args) {

        int produs=produs(Arrays.asList(1,0,2,0,3),Arrays.asList(1,2,0,3,1));
        System.out.println(produs);
    }

    static public int produs(List<Integer> v1, List<Integer> v2){

        int rez=0;
        for(int i=0;i<v1.size();i++)
            rez+=v1.get(i)*v2.get(i);

        return rez;
    }
}
