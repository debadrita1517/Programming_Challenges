import java.util.*;
public class MinimumIndexedCharacter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str1=sc.next().toLowerCase().trim();
			String str2=sc.next().toLowerCase().trim();
			System.out.println(calc(str1,str2));
		}
		sc.close();
	}
	public static char calc(String str1,String str2)
	{
		char ch='$';
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str2.length();i++)
		{
			if(hm.containsKey(str2.charAt(i)))
				hm.put(str2.charAt(i),hm.get(str2.charAt(i))+1);
			else
				hm.put(str2.charAt(i),1);
		}
		for(int i=0;i<str1.length();i++)
		{
			if(hm.containsKey(str1.charAt(i)))
			{
				ch=str1.charAt(i);
				break;
			}
		}
		return ch;
	}
}
