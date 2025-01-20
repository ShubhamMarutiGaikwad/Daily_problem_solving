package org.arise.patternProblems;
/*
         *
       * *
     * * *
   * * * *
 * * * * *   */
public class RHS_Half_Triangle_Up {

    public static void main(String[] args) {

        int n=5;
        for(int i=n;i>=1;i--)//5 4
        {
            for(int j=1;j<=n;j++)//2 3 4
            {
                if(i==j || (i<j)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
