/*
The cost of stock on each day is given in an array A[] of size N.
Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.
Example 1:
Input:
N = 7
A[] = {100,180,260,310,40,535,695}
Output:
(0 3) (4 6)
Explanation:
We can buy stock on day 0,
and sell it on 3rd day, which will 
give us maximum profit. Now, we buy 
stock on day 4 and sell it on day 6.
*/
    ArrayList<ArrayList<Integer> > stockBuySell(int price[], int n)
    {
                ArrayList<Integer> sell = new ArrayList<Integer>();
				ArrayList<Integer> buy = new ArrayList<Integer>();
                 int i =0;
                 int c= 0;
                 while(i < n-1)
                 {
                	 while((i<n-1) && (price[i] >= price[i+1]))
                		 i++;
                	 if(i == n-1)
                		 break;
                	 buy.add(i++);
                	 while((i< n-1) && (price[i] <= price[i+1]))
                		 i++;
                	 sell.add(i);
                	 c++;
                 }
                 ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
                 for(i=0;i<sell.size();i++)
                 {
                     ArrayList<Integer> temp=new ArrayList<Integer>();
                     temp.add(buy.get(i));
                     temp.add(sell.get(i));
                     res.add(temp);
                 }
                 return res;
    }
}
