import java.util.*;
public class SherlockAndValidString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next().toLowerCase().trim();
		System.out.println(calc(str));
		sc.close();
	}
	public static String calc(String str)
	{
		String res="NO";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch)==true)
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch,1);
		}
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		Set<Character> s1=hm.keySet();
		for(Character i:s1)
		{
			int val=hm.get(i);
			if(hm2.containsKey(val)==true)
				hm2.put(val,hm2.get(val)+1);
			else
				hm2.put(val,1);
		}
		if(hm2.size()==1)
			res="YES";
		else if(hm2.size()==2)
		{
			ArrayList<Integer> arr=new ArrayList<Integer>();
			Set<Integer> s2=hm2.keySet();
			for(Integer i:s2)
				arr.add(i);
			if((int)Math.abs(arr.get(0)-arr.get(1))==1)
				res="YES";
			else
				res="NO";
		}
		else
			res="NO";
		return res;
	}
}
