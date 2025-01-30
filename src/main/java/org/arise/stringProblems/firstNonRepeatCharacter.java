package org.arise.stringProblems;

import java.util.Scanner;

public class firstNonRepeatCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String s=input.nextLine();
        char ch[]=s.toCharArray();

        //convert string to lower case
        for(int i=0;i< ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]=(char)(ch[i]+32);//V+32
            }
        }
        System.out.println("converted lower string is:"+ new String(ch));

        //j a v a s c r i p t
        //0 1 2 3 4 5 6 7 8 9
        for(int i=0;i< ch.length;i++)//0 1 2
        {   //abcdd
            int begin=i+1;//1 2 3
            int end= ch.length-1;//4 //4 4
            while (begin<end)
            {
                if(ch[i]==ch[begin] || ch[i]==ch[end] )//ab ad//ac ad//bc bd
                {
                    System.out.println("First repeating character :"+ch[i]);
                    return;
                }
                begin++;//23//3
                end--;//32//3

            }
        }


        input.close();
    }
}
