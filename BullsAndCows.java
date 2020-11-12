import java.util.*;
public class BullsAndCows
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		ArrayList<Integer> secret=new ArrayList<Integer>();
		ArrayList<Integer> guess=new ArrayList<Integer>();
		for(int i=0;i<str[0].length();i++)
		{
			secret.add(Integer.parseInt(String.valueOf(str[0].charAt(i))));
			guess.add(Integer.parseInt(String.valueOf(str[1].charAt(i))));
		}
		System.out.println(calc(secret,guess));
		sc.close();
	}
	public static String calc(ArrayList<Integer> secret,ArrayList<Integer> guess)
	{
		int x=0,y=0;
		for(int i=0;i<secret.size();i++)
			if(secret.get(i)==guess.get(i))
				x++;
		HashMap<Integer,Integer> secrethm=new HashMap<Integer,Integer>();
		for(int i=0;i<secret.size();i++)
		{
			if(secrethm.containsKey(secret.get(i))==true)
				secrethm.put(secret.get(i),secrethm.get(secret.get(i)+1));
			else
				secrethm.put(secret.get(i),1);
		}
		for(int i=0;i<secret.size();i++)
			if(secrethm.containsKey(guess.get(i))==true&&secret.get(i)!=guess.get(i))
				y++;
		return String.valueOf(x)+"A"+String.valueOf(y)+"B";
	}
}
