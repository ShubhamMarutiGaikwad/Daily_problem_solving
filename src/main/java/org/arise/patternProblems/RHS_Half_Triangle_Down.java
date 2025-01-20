package org.arise.patternProblems;
/*
 * * * * *
   * * * *
     * * *
       * *
         *
 */

public class RHS_Half_Triangle_Down {

    public static void main(String[] args) {


        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i==j)||(j>i))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
