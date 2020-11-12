import java.util.*;
public class FloodFillAlgorithm
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int m=sc.nextInt(),n=sc.nextInt();
			int[][] arr=new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					arr[i][j]=sc.nextInt();
			int x=sc.nextInt(),y=sc.nextInt();
			int c=sc.nextInt();
			int prev=arr[x][y];
			calc(arr,m,n,x,y,prev,c);
			for(int i=0;i<m;i++)
			{
				System.out.println();
				for(int j=0;j<n;j++)
					System.out.print(arr[i][j]+" ");
			}
		}
		sc.close();
	}
	public static void calc(int[][] arr,int m,int n,int x,int y,int prev,int c)
	{
		if(x<0||x>=m||y<0||y>=n)
			return;
		if(arr[x][y]!=prev)
			return;
		arr[x][y]=c;
		calc(arr,m,n,(x+1),y,prev,c);
		calc(arr,m,n,(x-1),y,prev,c);
		calc(arr,m,n,x,(y+1),prev,c);
		calc(arr,m,n,x,(y-1),prev,c);
	}
}
