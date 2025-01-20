package org.arise.arrayProblem;

public class descindingOrder {

    public static void main(String[] args) {

        int arr[] = {12, 35, 1, 10, 34, 15};

        for(int i=0;i<arr.length;i++)
        {
            int temp;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }



    }
}
