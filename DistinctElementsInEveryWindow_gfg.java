/*
Given an array of integers and a number K.
Find the count of distinct elements in every window of size K in the array.
Example 1:
Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 2 4 4 2
Explanation: Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 2. 
Window 2 of size k = 4 is 2 1 3 4. Number
of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number
of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number
of distinct elements in this window are 2.
*/
ArrayList<Integer> countDistinct(int[] arr,int n,int k)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(k>n)
            return list;
        else
        {
            int j=0;
            for(int i=1;i<=n-k+1;i++)
            {
                HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
                for(int m=j;m<j+k;m++)
                {
                    if(map.containsKey(arr[m]))
                        map.put(arr[m],map.get(arr[m])+1);
                    else
                        map.put(arr[m],1);
                }
                Set<Integer> s1=map.keySet();
                int c=0;
                for(Integer m:s1)
                    if(map.get(m)==1)
                        c++;
                list.add(c);
                j++;
            }
            return list;
        }
