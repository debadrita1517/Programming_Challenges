import java.util.*;
public class LongestSubstringWithNonRepeatedCharacters
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase().trim();
		System.out.println(calc(s));
		sc.close();
	}
	public static int calc(String s)
	{
		int c=0;
		HashSet<Character> set=new HashSet<Character>();
		int i=0,j=0;
		while(i<s.length())
		{
			if(set.contains(s.charAt(i))==false)
			{
				set.add(s.charAt(i));
				c++;
				i++;
			}
			else
			{
				if(i<(s.length()-1)&&set.size()<(s.length()-(i+1)))
				{
					i=j+1;
					j=i;
					c=0;
					set.clear();
				}
				else
					break;
			}
		}
		return c;
	}
}
