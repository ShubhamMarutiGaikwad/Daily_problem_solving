package org.arise.stringProblems;

import java.util.Scanner;

public class toggle_string_character {

    public static String toggleString(String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str=input.nextLine();
        String togglesString=toggleString(str);
        System.out.println("Toggles string is: "+togglesString);
    }
}
/* We can use StringBuilder as well, instead of converting string to char array, but there is conditional statement
to check character is from A/a toZ/z , we need to add one more to check if it's character only then append to StringBulder object*/
