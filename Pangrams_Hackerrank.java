//package HackerrankPrograms;
import java.util.*;
class Pangram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        System.out.println(calc(s));
        sc.close();
    }
    public static String calc(String s)
    {
        String res="not pangram";
        HashMap<Character,Integer> s1=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s1.containsKey(s.charAt(i))==true)
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);
            else
            	s1.put(s.charAt(i),1);
        }
        if((s1.size()-1)==26)
        	res="pangram";
        return res;
    }
}
