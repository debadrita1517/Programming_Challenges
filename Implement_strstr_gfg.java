/*
Your task is to implement the function strstr.
The function takes two strings as arguments (s,x) and 
locates the occurrence of the string x in the string s.
The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
*/
int strstr(String str,String target)
    {
        if(target.length()>str.length())
            return -1;
        else
        {
            int pos=-1;
            String temp="";
            for(int i=0;i<str.length()-(target.length()-1);i++)
            {
                if(str.charAt(i)==target.charAt(0))
                {
                    temp=str.substring(i,i+target.length());
                    if(temp.equals(target)==true)
                    {
                        pos=i;
                        break;
                    }
                    else
                        temp="";
                }
            }
            return pos;
        }
    }
