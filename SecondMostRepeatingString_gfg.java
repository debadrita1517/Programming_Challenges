/*
Given a sequence of strings, the task is to find out the
second most repeated (or frequent) string in the given sequence.
Note: No two strings are the second most repeated,
there will be always a single string.
Example 1:
Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.
*/
String secFrequent(String arr[],int n)
    {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int freq[]=new int[map.size()];
        Set<String> s1=map.keySet();
        int i=0;
        for(String j:s1)
            freq[i++]=map.get(j);
        Arrays.sort(freq);
        int res_freq=freq[freq.length-2];
        String res="";
        for(String j:s1)
        {
            if(map.get(j)==res_freq)
            {
                res=j;
                break;
            }
        }
        return res;
    }
