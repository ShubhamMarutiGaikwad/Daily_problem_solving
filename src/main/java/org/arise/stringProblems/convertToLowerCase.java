package org.arise.stringProblems;

public class convertToLowerCase {

    public static void main(String[] args) {

        String s="ShuBHam";

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]= (char) (32+ch[i]);
            }
        }

        System.out.println("converted string is: "+new String(ch));

    }
}
