/*
Given two strings a and b consisting of lowercase characters.
The task is to check whether two given strings are an anagram of each other or not.
An anagram of a string is another string that contains the same characters,
only the order of characters can be different.
For example, “act” and “tac” are an anagram of each other.
*/
public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
            return false;
        else if((a.length()>(int)Math.pow(10,5))||(b.length()>(int)Math.pow(10,5)))
            return false;
        else if(a.length()<1||b.length()<1)
            return false;
        else
        {
            HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++)
        {
            if(map1.containsKey(a.charAt(i)))
                map1.put(a.charAt(i),map1.get(a.charAt(i))+1);
            else
                map1.put(a.charAt(i),1);
        }
        for(int i=0;i<b.length();i++)
        {
            if(map2.containsKey(b.charAt(i)))
                map2.put(b.charAt(i),map2.get(b.charAt(i))+1);
            else
                map2.put(b.charAt(i),1);
        }
        boolean flag=true;
        Set<Character> s1=map1.keySet();
        for(Character i:s1)
        {
            if(map2.containsKey(i))
            {
                if(map2.get(i)!=map1.get(i))
                    flag=false;
            }
            else
                flag=false;
            if(flag==false)
                break;
        }
        return flag;
        }
    }
