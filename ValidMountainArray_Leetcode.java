import java.util.*;
public class ValidMountainArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(calc(arr));
		sc.close();
	}
	public static boolean calc(int[] arr)
	{
		if(arr.length<3)
			return false;
		else
		{
			int j=0;
			boolean flag=true;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>arr[i-1])
				{
					if(i==arr.length-1)
					{
						flag=false;
						break;
					}
				}
				else if(arr[i]==arr[i-1])
				{
					flag=false;
					break;
				}
				else if(arr[i]<arr[i-1])
				{
					j=i;
					break;
				}
			}
			if(j>0)
			{
				for(int i=j+1;i<arr.length;i++)
				{
					if(arr[i]>arr[i-1])
					{
						flag=false;
						break;
					}
					else if(arr[i]==arr[i-1])
					{
						flag=false;
						break;
					}
				}
			}
			return flag;
		}
	}
}
