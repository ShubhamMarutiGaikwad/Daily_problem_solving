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

        System.out.println("space count using split: "+spaceCnt);

        System.out.println("=====Second approach====");
        String s="Java is great and Java is fun. Programming fun in Java is great. Programming";
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }

        System.out.println("space count without using split:"+count);


    }
}
