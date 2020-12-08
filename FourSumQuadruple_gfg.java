import java.util.*;
public class FourSumQuadruple
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		List<List<Integer>> res=calc(arr,k);
		for(int i=0;i<res.size();i++)
		{
			for(int j=0;j<res.size();j++)
				System.out.print(res.get(j)+" ");
			System.out.print("$");
		}
		System.out.println();
		sc.close();
	}
	public static List<List<Integer>> calc(int[] arr,int target)
	{
		Arrays.sort(arr);
	    return kSum(arr,target,0,4);
	}
	public static List<List<Integer>> kSum(int[] arr,int target,int start,int k)
	{
	    List<List<Integer>> res=new ArrayList<>();
	    if(start==arr.length||arr[start]*k>target||target>arr[arr.length-1]*k)
	        return res;
	    if(k==2)
	        return twoSum(arr,target,start);
	    for(int i=start;i<arr.length;++i)
	        if(i==start||arr[i-1]!=arr[i])
	            for (List<Integer> set:kSum(arr,target-arr[i],i+1,k-1))
	            {
	                res.add(new ArrayList<>(Arrays.asList(arr[i])));
	                res.get(res.size()-1).addAll(set);
	            }
	    return res;
	}
	public static List<List<Integer>> twoSum(int[] arr,int target,int start)
	{
	    List<List<Integer>> res=new ArrayList<>();
	    Set<Integer> s=new HashSet<>();
	    for(int i=start;i<arr.length;++i)
	    {
	        if(res.isEmpty()||res.get(res.size()-1).get(1)!=arr[i])
	            if(s.contains(target-arr[i]))
	                res.add(Arrays.asList(target-arr[i],arr[i]));
	        s.add(arr[i]);
	    }
	    return res;
	}
}
