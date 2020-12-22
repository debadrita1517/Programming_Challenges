/*Given an array nums of n integers where n > 1,  return an array output such that output[i] is 
equal to the product of all the elements of nums except nums[i].
Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or 
suffix of the array(including the whole array) fits in a 32 bit integer.
Note: Please solve it without division and in O(n).*/

class Solution
{
    public int[] productExceptSelf(int[] arr)
    {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int p=1;
        for(int i=0;i<arr.length;i++)
        {
            left[i]=p;
            p*=arr[i];
        }
        p=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            right[i]=p;
            p*=arr[i];
        }
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            res[i]=left[i]*right[i];
        return res;
    }
}
