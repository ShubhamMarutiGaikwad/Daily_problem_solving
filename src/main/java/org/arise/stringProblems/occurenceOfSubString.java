package org.arise.stringProblems;

import java.util.HashMap;
import java.util.Map;

public class occurenceOfSubString {

    public static void main(String[] args) {

        //a b c a b c b a b c a b   a  b  a  c  a  b  c
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
        String s1="abcabcbabcabcababacacabc";
        String s2="abc";

        int beginIndex=0;
        int endIndex=s2.length();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(endIndex==s1.length())
            {
                break;
            }
            String subString=s1.substring(beginIndex,endIndex);
            if(subString.equalsIgnoreCase(s2))
            {
                count++;//123
            }
            beginIndex++;
            endIndex++;

            if(endIndex==s1.length() && s1.substring(beginIndex,endIndex).equalsIgnoreCase(s2))
            {
                count++;
            }
        }

        System.out.println("Substring "+s2+" occured "+count+" times");

    }
}
