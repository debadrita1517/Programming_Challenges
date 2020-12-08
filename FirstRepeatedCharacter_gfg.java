import java.util.*;
public class FirstRepeatedCharacter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str=sc.next().toLowerCase().trim();
			System.out.println(calc(str));
		}
		sc.close();
	}
	public static String calc(String str)
	{
		String res="-1";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(hs.contains(str.charAt(i)))
			{
				res=String.valueOf(str.charAt(i));
				break;
			}
			else
				hs.add(str.charAt(i));
		}
		return res;
	}
}
