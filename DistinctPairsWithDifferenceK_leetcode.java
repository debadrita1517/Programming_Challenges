import java.util.*;
public class CountDistinctPairsWithDifferenceK
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			calc(arr,k);
		}
		sc.close();
	}
	public static void calc(int[] arr,int k)
	{
		if(arr.length<2)
			System.out.println(-1);
		else
		{
			int c=0;
			String res="";
			HashSet<Integer> set=new HashSet<Integer>();
			for(int i=0;i<arr.length;i++)
				set.add(arr[i]);
			HashSet<String> setpair=new HashSet<String>();
			for(int i=0;i<arr.length;i++)
			{
				if(set.contains(k-(int)Math.abs(arr[i])))
				{
					String str="";
					if(arr[i]>(k-(int)Math.abs(arr[i])))
						str=String.valueOf(arr[i])+","+String.valueOf(k-(int)Math.abs(arr[i]));
					else
						str=String.valueOf(k-((int)Math.abs(arr[i])))+","+String.valueOf(arr[i]);
					if(setpair.contains(str)==false)
					{
						setpair.add(str);
						c++;
						res+="("+str+") ";
					}
				}
			}
			if(c==0)
				System.out.println(0);
			else
				System.out.println(c+"\n"+res);
		}
	}
}
