package org.arise.arrayProblem;

public class findSubsequentNumberPair {

    public static void main(String[] args) {

        int arr[]={1,3,4,5,9,10,7,8,-1,0,1};
        int pairNo=0;
        for(int i=0;i<arr.length-1;i++)//01
        {
            int check=arr[i]+1;
            if(check==arr[i+1])//13
            {
                pairNo++;//0
                System.out.println(pairNo+" pair "+arr[i]+","+arr[i+1]);
            }
        }
    }
}
