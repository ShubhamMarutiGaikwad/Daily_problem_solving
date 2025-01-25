package org.arise.arrayProblem;

public class SecondHighestWithoutSort {

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 45};

        if(arr.length<2)
        {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int larget=arr[0];
        int secondLargest=arr[0];

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>larget)
            {
                larget=arr[i];
            }
        }

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=larget){
                if(arr[i]>secondLargest)
                {
                    secondLargest=arr[i];
                }
            }
        }

        System.out.println("2nd largest element is:"+secondLargest);
    }
}
