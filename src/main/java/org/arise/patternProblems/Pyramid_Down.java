package org.arise.patternProblems;

public class Pyramid_Down {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++)//5 4
        {
            for(int j=1;j<=5;j++)//1 2 3 4 5
            {
                if(i==j || (j>i)){ //
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
