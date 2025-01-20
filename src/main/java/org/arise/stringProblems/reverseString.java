package org.arise.stringProblems;

public class reverseString
{

    public static void forLoop(String str)
    {
        char arr[]=str.toCharArray();
        String s1="";
        for(int i=arr.length-1;i>=0;i--)
        {
            s1=s1+arr[i];
        }

        System.out.println("s1: "+s1);
    }

    public static void whileLoop(String str)
    {
        char arr[]=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        char temp=' ';
        while (start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[temp];

            start++;
            end--;
        }
        char Arr[]= str.toCharArray();

        int iStart=0;
        int iEnd=Arr.length-1;

        char cTemp=' ';

        while(iStart<iEnd)
        {
            cTemp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=cTemp;

            iStart++;
            iEnd--;
        }

        System.out.println("new string is:"+ new String(Arr));
        System.out.println("new string is:"+ new String(arr));
    }
    public static void main(String[] args) {

        forLoop("Shubham");
        whileLoop("Shubham");
    }
}
