package org.arise.stringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class countWhiteSpace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");

        String str=input.nextLine();

        String[] arr =str.split("\\W+");

        int spaceCnt= arr.length-1;

        System.out.println("space count is: "+spaceCnt);


    }
}
