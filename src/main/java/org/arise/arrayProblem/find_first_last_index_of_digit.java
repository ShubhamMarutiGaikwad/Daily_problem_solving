package org.arise.arrayProblem;

import java.util.Scanner;

public class find_first_last_index_of_digit {

    public static void findIndexOfReqEle(int []arr,int searchDigit)
    {
        int firstIndex=0;
        int lastIndex=0;
        boolean found=true;
        for (int i=0;i<arr.length;i++){
            if(searchDigit==arr[i] && found){
                firstIndex=i;
                lastIndex=i; //if element present only onee
                found=false;
            }
            else if (searchDigit==arr[i]){
                lastIndex=i;
            }
        }
        if(firstIndex==lastIndex && !found){
            System.out.println("Element present one time in array at index: "+firstIndex);
        }
        else if(firstIndex==0 && lastIndex==0 && arr[0]!=searchDigit){
            System.out.println(searchDigit+" not present in array");
        }
        else {
            System.out.println(searchDigit+" found first at index: "+firstIndex+" and last at: "+lastIndex);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter size of the input array");
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter elements of the input array");

// input the array
        for(int i=0; i< num; i++) {
            arr[i] = scnr.nextInt();
        }

        System.out.println("Enter target element to be searched.");
        int targetEle = scnr.nextInt();
        findIndexOfReqEle(arr,targetEle);
    }
}
