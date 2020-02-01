package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ppi getPPI = new ppi();
        counter getAns = new counter();
        getPPI.GetPPI();
        getAns.CountDistance(getPPI.PPIResult);
        getAns.OutPutAnswer();
    }
}
