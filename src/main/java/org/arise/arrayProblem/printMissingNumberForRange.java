package org.arise.arrayProblem;

public class printMissingNumberForRange {

    public static void main(String[] args) {

        int arr[]={6,10,9,1,5,2};

        for(int i=1;i<=20;i++)//1
        {
            int count=0;
            for(int j=0;j< arr.length;j++)//012345
            {
                if(i==arr[j])//6109152
                {
                    count++;//0000111
                }
            }
            if(count==0)
            {
                System.out.println(i+" is not present");
            }
        }
    }
}
