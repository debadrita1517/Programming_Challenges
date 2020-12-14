import java.util.*;
public class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int[] arr1=new int[n1];
            int[] arr2=new int[n2];
            for(int i=0;i<n1;i++)
                arr1[i]=sc.nextInt();
            for(int i=0;i<n2;i++)
                arr2[i]=sc.nextInt();
            System.out.println(calc(arr1,arr2));
        }
        sc.close();
    }
    public static String calc(int[] arr1,int[] arr2)
    {
        String res="Yes";
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            if(map1.containsKey(arr1[i]))
                map1.put(arr1[i],map1.get(arr1[i])+1);
            else
                map1.put(arr1[i],1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(map2.containsKey(arr2[i]))
                map2.put(arr2[i],map2.get(arr2[i])+1);
            else
                map2.put(arr2[i],1);
        }
        Set<Integer> set2=map2.keySet();
        for(Integer i:set2)
        {
            if(map2.get(i)!=map1.get(i))
            {
                res="No";
                break;
            }
        }
        return res;
    }
}
