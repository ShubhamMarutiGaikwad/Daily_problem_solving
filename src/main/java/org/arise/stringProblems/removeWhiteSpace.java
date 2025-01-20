package org.arise.stringProblems;

public class removeWhiteSpace {
    public static void main(String[] args) {
        String s1 = "hear t gv gv jhv hv hv fc yg fc hg ";

        char ch[]=s1.toCharArray();
        String str="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                str=str+ch[i];
            }
            else {
                continue;
            }
        }

        System.out.println("string without space is: "+str);
    }
}
