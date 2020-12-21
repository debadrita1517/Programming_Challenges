/*You are given an integer array nums and you have to return a new counts array.
The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
Example 1:
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.*/

class Solution
{
    public List<Integer> countSmaller(int[] arr)
    {
        List<Integer> res=new ArrayList<Integer>();
        if(arr.length==0)
            return res;
        else if(arr.length==1)
        {
            res.add(0);
            return res;
        }
        else
        {
            for(int i=0;i<arr.length-1;i++)
            {
                int n=arr[i];
                int c=0;
                for(int j=i+1;j<arr.length;j++)
                    if(arr[j]<n)
                        c++;
                res.add(c);
            }
            res.add(0);
            return res;
        }
    }
}
