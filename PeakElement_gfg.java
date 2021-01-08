/*
A peak element in an array is the one that is not smaller than its neighbours.
Given an array of size N, find the index of any one of its peak elements.
*/
public int peakElement(int[] arr,int n)
    {
        if(arr.length==0)
            return -1;
        else if(arr.length==1)
            return 0;
        else if(arr.length==2)
        {
            if(arr[0]>arr[1])
                return 0;
            else
                return 1;
        }
        else
        {
            int res=-1;
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    if(arr[1]<arr[0])
                    {
                        res=0;
                        break;
                    }
                }
                else if(i==n-1)
                {
                    if(arr[n-1]>arr[n-2])
                    {
                        res=n-1;
                        break;
                    }
                }
                else
                {
                    if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
                    {
                        res=i;
                        break;
                    }
                }
            }
            return res;
        }
    }
