package org.arise.numberProblems;

import java.util.Scanner;
import java.util.SortedMap;

public class fibonacciSeries {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int no=scan.nextInt();

        int previous=0;
        int next=1;
        int result=previous+next;//1
        System.out.print(previous+" ");
        System.out.println(next+" ");

        for(int i=2;i<=no;i++)//5
        {
            System.out.print(result+" ");//1 2 3
            previous=next;//1 1
            next=result;//1 2
            result=previous+next;//2 3
        }
    }
}
