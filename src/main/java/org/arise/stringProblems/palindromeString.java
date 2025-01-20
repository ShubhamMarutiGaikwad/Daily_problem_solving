package org.arise.stringProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class palindromeString {


    public static void palindrome(String s)
    {
        char ch[]=s.toCharArray();
        int start =0;
        int end=ch.length-1;
        char temp=' ';
        while (start<end)
        {
            temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }

        System.out.println("reverse: "+ new String(ch));
    }
    public static void main(String[] args) {

        String arr[]={"racecar","Madam","Mom","cool","ada","level","shubham","civic"};

        Map<String,Boolean> mp = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            String str="";
            char ch[]=arr[i].toLowerCase().toCharArray();
            for(int j=arr[i].length()-1;j>=0;j--)
            {
               str=str+ch[j];
            }
            if(str.equals(arr[i]))
            {
                mp.put(arr[i],true);
            }
            else {
                mp.put(arr[i],false);
            }

        }

        System.out.println(mp);
        System.out.println("==============");
        palindrome("1abccBA1");
    }
}
