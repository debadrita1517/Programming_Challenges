/*Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first.
If frequencies of two elements are same, then smaller number comes first.
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
Output:
For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.
Constraints:
1 ≤ T ≤ 70
30 ≤ N ≤ 130
1 ≤ Ai ≤ 60 
Example:
Input:
2
5
5 5 4 6 4
5
9 9 9 2 5
Output:
4 4 5 5 6
9 9 9 2 5*/
import java.util.*;
class SortingByFrequency
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t>0){
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for(int i=0; i<n; i++){
	            a[i] = sc.nextInt();
	        }
	        Arrays.sort(a);
	        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i=0; i<n; i++){
	            if(hash.containsKey(a[i]))
	                hash.put(a[i],hash.get(a[i])+1);
	            else
	                hash.put(a[i],1);
	        }
	    Set<Integer> s = hash.keySet();
        int ne = s.size(); 
        Integer arr[] = new Integer[ne]; 
        arr = s.toArray(arr);
	        int temp =0;
	        for(int j=0; j<arr.length-1; j++){
	            for(int i=0; i<arr.length-1; i++){
	                if(hash.get(arr[i])<hash.get(arr[i+1])){
	                temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	        }}
	        for(int i=0; i<ne; i++){
	            for(int j=0; j<hash.get(arr[i]); j++)
	            System.out.print(arr[i]+" ");
	        }
	        t--;
	        System.out.println();
	    }
	    sc.close();
}
}
