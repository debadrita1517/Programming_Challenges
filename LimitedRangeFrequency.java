import java.util.*;
public class LimitedRangeFrequency
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		calc(n,arr);
		sc.close();
	}
	public static void calc(int n,ArrayList<Integer> arr)
	{
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=1;i<=n;i++)
			tm.put(i,0);
		for(int i=0;i<arr.size();i++)
			if(tm.containsKey(arr.get(i)))
				tm.put(arr.get(i),tm.get(arr.get(i))+1);
		for(int i=1;i<=n;i++)
			System.out.print(tm.get(i)+" ");
	}
}
