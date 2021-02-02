/*
Given a non-empty array of integers,
find the top K elements which have the highest frequency in the array.
If two numbers have the same frequency then the larger number should be given preference. 
*/
static ArrayList<Integer> TopK(ArrayList<Integer> arr, int k) 
	{
		ArrayList<Integer> res=new ArrayList<Integer>();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.size();i++)
		{
		    if(map.containsKey(arr.get(i)))
		        map.put(arr.get(i),map.get(arr.get(i))+1);
		    else
		        map.put(arr.get(i),1);
		}
		while(k>0)
		{
		    int max=0,pos=0;
		    Set<Integer> s1=map.keySet();
		    for(Integer i:s1)
		    {
		        if(map.get(i)>max)
		        {
		            max=map.get(i);
		            pos=i;
		        }
		        if(map.get(i)==max)
		        {
		            if(i>pos)
		                pos=i;
		        }
		    }
		    res.add(pos);
		    map.remove(pos);
		    k--;
		}
		return res;
	}
