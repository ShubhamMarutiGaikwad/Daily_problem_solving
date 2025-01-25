package org.arise.numberProblems;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int no=scan.nextInt();

        for(int i=1;i<=no;i++)//2
        {
            int count=0;
            for(int j=1;j<=no;j++)//2
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i+" is prime number");
            }
        }


    }
}
