package org.arise.numberProblems;

import java.util.Scanner;

public class digitCountFromNumber {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter number");
        int no=input.nextInt();

        //check if number is not 0
        if(no==0) {
            System.out.println("No of digit :"+1);
            return;
        }
        //if number is -ve convert to +ve
        if(no<0) {
            no=-no;
        }
        int count=0;
        while (no!=0) {
            count++;
            no=no/10;
        }
        System.out.println("No of digit :"+count);

    }
}
