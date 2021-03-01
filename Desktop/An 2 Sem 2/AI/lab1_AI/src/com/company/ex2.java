package com.company;

public class ex2 {

    public static void main(String[] args) {

        double[] a= new double[] {1,5};
        double[] b= new double[] {4,1};
        System.out.println(distanta(a,b));
    }

    static public double distanta(double[] a, double[] b){

        double dist = Math.sqrt((a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]) );
        return dist;
    }

}
