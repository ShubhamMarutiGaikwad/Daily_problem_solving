package org.arise.stringProblems;

import java.util.HashMap;
import java.util.Map;

public class anagramString {

    public static void main(String[] args) {

        String s1 = "heart";
        String s2 = "earth";
        if(s1.length()!=s2.length())
        {
            System.out.println("Not anagram");
            return;
        }

        char ch1[]=s1.toLowerCase().toCharArray();
        char ch2[]=s2.toLowerCase().toCharArray();

        Map<Character,Integer> mp1= new HashMap<>();
        Map<Character,Integer> mp2= new HashMap<>();

        for(int i=0;i<ch1.length;i++)
        {
            if(mp1.containsKey(ch1[i]))
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<ch1.length;j++)
            {
                if(ch1[i]==ch1[j])
                {
                    count++;
                }
            }
            mp1.put(ch1[i],count);
        }

        for(int i=0;i<ch2.length;i++)
        {
            if(mp2.containsKey(ch2[i]))
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<ch2.length;j++)
            {
                if(ch2[i]==ch2[j])
                {
                    count++;
                }
            }
            mp2.put(ch2[i],count);
        }

        if(mp1.equals(mp2))
        {
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }

    }
}
