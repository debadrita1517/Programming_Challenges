/*
You are playing the Bulls and Cows game with your friend.
You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:
The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
Example 1:
Input: secret = "1807", guess = "7810"
Output: "1A3B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1807"
  |
"7810"
Example 2:
Input: secret = "1123", guess = "0111"
Output: "1A1B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1123"        "1123"
  |      or     |
"0111"        "0111"
Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
Example 3:
Input: secret = "1", guess = "0"
Output: "0A0B"
Example 4:
Input: secret = "1", guess = "1"
Output: "1A0B"
 Constraints:
1 <= secret.length, guess.length <= 1000
secret.length == guess.length
secret and guess consist of digits only.
*/

//the code
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
