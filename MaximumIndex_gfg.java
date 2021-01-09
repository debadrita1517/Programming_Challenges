/*
Given an array A[] of N positive integers.
The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
Example :
Input:
N = 9
A[] = {34,8,10,3,2,80,30,33,1}
Output: 6
Explanation: In the given array 
A[1] < A[7] satisfying the required 
condition(A[i] <= A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).
*/
static int maxIndexDiff(int arr[], int n)
    {
        int diff=0,j=n-1;
        for(int i=0;i<n-1;)
        {
            if(arr[i]<=arr[j])
            {
                if((j-i)>=diff)
                    diff=j-i;
            }
            if(j==0)
            {
                i++;
                j=n-1;
            }
            else
                j--;
        }
        return diff;
    }
