import java.util.*;
public class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        String s=sc.next().toLowerCase().trim();
        System.out.println(calc(s));
        }
        sc.close();
    }
    public static int calc(String s)
    {
        int pos=1,max=1;
        HashSet<Character> set=new HashSet<Character>();
        set.add(s.charAt(0));
        for(int i=1;i<s.length();)
        {
            if(set.contains(s.charAt(i)))
            {
                if(set.size()>max)
                    max=set.size();
            set.clear();
            set.add(s.charAt(pos++));
            i=pos;
            }
            else
                set.add(s.charAt(i++));
            if(set.size()>max)
                max=set.size();
        }
        return max;
    }
}
