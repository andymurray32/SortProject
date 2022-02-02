package com.spartaglobal.sortingalgo.View;

import java.util.Scanner;

public class SortView {
    public String getDesiredMethodType(){
    System.out.print("Please enter the sort method you would like to use: ");
    Scanner s= new Scanner(System.in);
    String desiredMethodType= s.next();
        return desiredMethodType;
    }}
