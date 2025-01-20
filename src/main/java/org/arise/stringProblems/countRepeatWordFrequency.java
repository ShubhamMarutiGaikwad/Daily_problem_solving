package org.arise.stringProblems;

import java.util.HashMap;
import java.util.Map;

public class countRepeatWordFrequency {

    public static void main(String[] args) {

        String str="Java is great and Java is fun. Programming fun in Java is great. Programming";


        //String str="java";
        String arr[]=str.split("\\W+");
        System.out.println("array length is:"+arr.length);
        if(arr.length==1)
        {
            System.out.println("Insufficient word in string");
            return;
        }

        Map<String,Integer> mp = new HashMap<>();

        for(int i=0;i< arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i].equalsIgnoreCase(arr[j]))
                {
                    count++;
                }
            }
            mp.put(arr[i],count);
        }

        System.out.println(mp);



    }
}
