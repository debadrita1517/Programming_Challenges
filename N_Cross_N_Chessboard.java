import java.util.*;
public class NcrossN_Chessboard
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			System.out.println(calc(n));
		}
		sc.close();
	}
	public static int calc(int n)
	{
		return (n*(n+1)/2)*(2*n+1)/3;
	}
}
