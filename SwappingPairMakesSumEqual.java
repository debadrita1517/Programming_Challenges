/*
Given two arrays of integers A[] and B[] of size N and M, the task is to check if a pair of values (one value from each array) 
exists such that swapping the elements of the pair will make the sum of two arrays equal.
Example 1:
Input: N = 6, M = 4
A[] = {4, 1, 2, 1, 1, 2}
B[] = (3, 6, 3, 3)
Output: 1
Explanation: Sum of elements in A[] = 11
Sum of elements in B[] = 15, To get same 
sum from both arrays, we can swap following 
values: 1 from A[] and 3 from B[]
Return 1 is possible else return -1.
*/
import java.util.*;
public class SwappingPairsMakeSumEqual
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		for(int i=0;i<n1;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
			arr2[i]=sc.nextInt();
		System.out.println(calc(n1,n2,arr1,arr2));
		sc.close();
	}
	public static int calc(int n1,int n2,int[] arr1,int[] arr2)
	{
		int s1=calcSum(n1,arr1),s2=calcSum(n2,arr2);
		if((s1+s2)%2!=0)
			return -1;
		else
		{
			int res=-1;
			int diff=(int)Math.abs(s1-s2)/2;
			if(s1>s2)
			{
				HashSet<Integer> hs=new HashSet<Integer>();
				for(int i=0;i<n1;i++)
					hs.add(arr1[i]);
				for(int i=0;i<n2;i++)
				{
					if(hs.contains(arr2[i]+diff))
					{
						res=1;
						break;
					}
				}
			}
			else
			{
				HashSet<Integer> hs=new HashSet<Integer>();
				for(int i=0;i<n2;i++)
					hs.add(arr2[i]);
				for(int i=0;i<n1;i++)
				{
					if(hs.contains(arr1[i]))
					{
						res=1;
						break;
					}
				}
			}
			return res;
		}
	}
	public static int calcSum(int n,int[] arr)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		return sum;
	}
}
