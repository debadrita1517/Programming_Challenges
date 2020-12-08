import java.util.*;
public class UncommonCharacters
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next().toLowerCase().trim();
		String str2=sc.next().toLowerCase().trim();
		System.out.println(calc(str1,str2));
		sc.close();
	}
	public static String calc(String str1,String str2)
	{
		HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++)
		{
			if(hm1.containsKey(str1.charAt(i)))
				hm1.put(str1.charAt(i),hm1.get(str1.charAt(i))+1);
			else
				hm1.put(str1.charAt(i),1);
		}
		for(int i=0;i<str2.length();i++)
		{
			if(hm2.containsKey(str2.charAt(i)))
				hm2.put(str2.charAt(i),hm2.get(str2.charAt(i))+1);
			else
				hm2.put(str2.charAt(i),1);
		}
		Set<Character> s1=hm1.keySet();
		Set<Character> s2=hm2.keySet();
		String res="";
		for(Character i:s1)
			if(hm2.containsKey(i)==false)
				res+=i;
		for(Character i:s2)
			if(hm1.containsKey(i)==false)
				res+=i;
		if(res=="")
			return String.valueOf(-1);
		else
		{
			int[] arr=new int[res.length()];
			for(int i=0;i<arr.length;i++)
				arr[i]=(int)res.charAt(i);
			Arrays.sort(arr);
			res="";
			for(int i=0;i<arr.length;i++)
				res+=(char)arr[i];
			return res;
		}
	}
}
