import java.util.*;
public class PrintAnagramsTogether
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			ArrayList<String> list=new ArrayList<String>();
			for(int i=0;i<n;i++)
				list.add(sc.next().toLowerCase().trim());
			List<List<String>> res=calc(list);
			for(int i=0;i<res.size();i++)
			{
				for(int j=0;j<res.get(i).size();j++)
					System.out.print(res.get(i).get(j)+" ");
				System.out.println();
			}
		}
		sc.close();
	}
	public static List<List<String>> calc(ArrayList<String> list)
	{
		HashMap<HashMap<Character, Integer>,ArrayList<String>>map=new HashMap<HashMap<Character, Integer>,ArrayList<String>>();
		for (String str:list)
		{
			HashMap<Character,Integer>
			tempMap=new HashMap<Character,Integer>();
			for (int i=0;i<str.length();i++)
			{
				if (tempMap.containsKey(str.charAt(i)))
				{
					int x=tempMap.get(str.charAt(i));
					tempMap.put(str.charAt(i),++x);
				}
				else
				{
					tempMap.put(str.charAt(i),1);
				}
			}
			if (map.containsKey(tempMap))
				map.get(tempMap).add(str);
			else
			{
				ArrayList<String>tempList=new ArrayList<String>();
				tempList.add(str);
				map.put(tempMap,tempList);
			}
		}
		List<List<String>>result=new ArrayList<>();
		for(HashMap<Character,Integer>temp:map.keySet())
			result.add(map.get(temp));
		return result;
	}
}
