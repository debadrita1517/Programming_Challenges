import java.util.*;
public class FlippingBits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			System.out.println(binaryToDecimal(decimalToBinary(n)));
		}
		sc.close();
	}
	public static int binaryToDecimal(ArrayList<Integer> arr)
	{
		int res=0,j=0;
		for(int i=(arr.size()-1);i>=0;i--)
		{
			res+=arr.get(i)*((int)Math.pow(2,j++));
		}
		return res;
	}
	public static ArrayList<Integer> decimalToBinary(int n)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Stack<Integer> s=new Stack<Integer>();
		while(n>0)
		{
			s.push(n%2);
			n/=2;
		}
		while(s.size()<33)
			s.add(0);
		for(int i=0;i<32;i++)
		{
			if(s.pop()==0)
				arr.add(1);
			else
				arr.add(0);
			s.pop();
		}
		return arr;
	}
}
