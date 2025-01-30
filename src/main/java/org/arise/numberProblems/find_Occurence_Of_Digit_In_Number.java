package org.arise.numberProblems;
//Calculate how many times a digit D occurs in the number N. One has to ask the user to give the values of N and D.


import java.util.Scanner;

public class find_Occurence_Of_Digit_In_Number
{
    public static int findDigitOccurence(int number,int digit) {
        if(number==0 && digit==0){
            return 1;
        }
        if(number<0){
            number=-number;
        }
        int count=0;
        while (number!=0){
            int rem=number%10;
            if(digit==rem){
                count++;
            }
            number=number/10;
        }
        return count;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number=input.nextInt();
        System.out.println("Enter digit");
        int digit=input.nextInt();
        int digitOccurence=findDigitOccurence(number,digit);
        if(digitOccurence!=0){
            System.out.println(digit+" occured for "+digitOccurence+" time");
        }
        else {
            System.out.println("given digit not present in number");
        }

    }
}
