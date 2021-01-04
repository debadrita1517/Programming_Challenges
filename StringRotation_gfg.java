/*
Given two strings a and b.
The task is to find if the string 'b' can be obtained by 
rotating another string 'a' by exactly 2 places.
*/
public static boolean isRotated(String s1, String s2)
{
        if(s1.length()!=s2.length())
            return false;
        else if(s1.length()<=2)
        {
            if(s1.equals(s2)==true)
                return true;
            else
                return false;
        }
        else
        {
            boolean res=false;
            String sClock="",sAnti="";
            sClock=String.valueOf(s1.charAt(s1.length()-2));
            sClock+=String.valueOf(s1.charAt(s1.length()-1));
            for(int i=0;i<=s1.length()-3;i++)
                sClock+=String.valueOf(s1.charAt(i));
            sAnti=String.valueOf(s1.charAt(1));
            sAnti=String.valueOf(s1.charAt(0))+sAnti;
            for(int i=s1.length()-1;i>=2;i--)
                sAnti=String.valueOf(s1.charAt(i))+sAnti;
            if((s2.equals(sClock)==true)||(s2.equals(sAnti)==true))
                res=true;
            return res;
        }
 }
