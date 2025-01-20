package org.arise.stringProblems;

public class FindLargestWord {
    public static void main(String[] args) {
        String str="Java is great and Java is fun. Programming fun in Java is great. Programming";

        String arr[]=str.split("\\W+");

        int size=0;
        String emptyWord="";
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i].length()>size){
                size=arr[i].length();
                emptyWord=arr[i];
            }
        }
        System.out.println("largest word is '"+emptyWord+" '"+" and size is "+size);


    }
}
