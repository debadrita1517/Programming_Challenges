//user function template for Java
static int findLongestConseqSubseq(int arr[],int n)
	{
	   // add your code here
	   if(n==1)
	    return 1;
	   else
	   {
	       HashSet<Integer> s1=new HashSet<Integer>();
	       ArrayList<Integer> list=new ArrayList<Integer>();
	       for(int i=0;i<n;i++)
	       {
	           if(s1.contains(arr[i])==false)
	               {
	                   s1.add(arr[i]);
	                   list.add(arr[i]);
	               }
	       }
	       arr=new int[list.size()];
	       n=arr.length;
	       for(int i=0;i<n;i++)
	           arr[i]=list.get(i);
	       Arrays.sort(arr);
	       int max=0;
	       HashSet<Integer> set=new HashSet<Integer>();
	       set.add(arr[0]);
	       for(int i=1;i<n;)
	       {
	           if(arr[i]-arr[i-1]==1)
	           {
	               set.add(arr[i]);
	               i++;
	           }
	           else
	           {
	               if(set.size()>max)
	                   max=set.size();
	               set.clear();
	               set.add(arr[i++]);
	           }
	           if(set.size()>max)
	               max=set.size();
	       }
	       return max;
	       }
	}
