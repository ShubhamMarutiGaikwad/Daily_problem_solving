package org.arise.stringProblems;

public class occurenceOfSubString_Copy {

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
            String subString=s1.substring(beginIndex,endIndex);//03 14 25 36 47 58 69 710 811 912 1013 1114 1215 1316 1417 1518
            if(subString.equalsIgnoreCase(s2))//abc bca cab abc bcb cba bab abc bca cab aba bab aba bac acc ccb
            {
                count++;//123
            }
            beginIndex++;//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
            endIndex++;//4 5 6 7 8 9 10 11 12 13 14 15 16 17 18

            if(endIndex==s1.length() && s1.substring(beginIndex,endIndex).equalsIgnoreCase(s2))
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
