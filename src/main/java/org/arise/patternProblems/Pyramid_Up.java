package org.arise.patternProblems;
/*

     *
    * *
   * * *
  * * * *
 * * * * *


 */
public class Pyramid_Up {

    public static void main(String[] args) {

        for(int i=5;i>=1;i--){

            for(int j=1;j<=5;j++)
            {
                if(i==j || (i<j)){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
