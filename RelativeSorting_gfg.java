import java.util.*;
public class RelativeSorting
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int[] arr1=new int[n1];
			int[] arr2=new int[n2];
			for(int i=0;i<n1;i++)
				arr1[i]=sc.nextInt();
			for(int i=0;i<n2;i++)
				arr2[i]=sc.nextInt();
			calc(n1,n2,arr1,arr2);
		}
		sc.close();
	}
	public static void calc(int n1,int n2,int[] arr1,int[] arr2)
	{
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		for(int i=0;i<n1;i++)
		{
			if(hm1.containsKey(arr1[i]))
				hm1.put(arr1[i],hm1.get(arr1[i])+1);
			else
				hm1.put(arr1[i],1);
		}
		HashSet<Integer> set2=new HashSet<Integer>();
		for(int i=0;i<n2;i++)
			set2.add(arr2[i]);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n2;i++)
		{
			if(hm1.containsKey(arr2[i]))
			{
				for(int j=1;j<=hm1.get(arr2[i]);j++)
					list.add(arr2[i]);
			}
		}
		int[] arr_rem=new int[n1-list.size()];
		int c=0;
		for(int i=0;i<n1;i++)
			if(set2.contains(arr1[i])==false)
				arr_rem[c++]=arr1[i];
		Arrays.sort(arr_rem);
		for(int i=0;i<arr_rem.length;i++)
			list.add(arr_rem[i]);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}
}
