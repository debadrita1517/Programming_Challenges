/*
Given a dictionary of words where each word follows CamelCase notation,
print all words in the dictionary that match with a given pattern consisting of uppercase characters only.
CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter.
Common examples include: “PowerPoint” and “WikiPedia”, “GeeksForGeeks”, “CodeBlocks”, etc.
Input:
The first line of input contains an integer T denoting the number of test cases.
Then the description of T test cases follow. Each test case contains an integer n denoting the number of words in the dictionary.
The next line contains the vector of strings in the dictionary. The last line contains the pattern.
Output:
Print all words in the dictionary that match with a given pattern consisting of uppercase characters only.
If the pattern is not found, print "No match found" (without quotes).
Example:
Input:
2
8
Hi Hello HelloWorld HiTech HiGeek HiTechWorld HiTechCity HiTechLab
HA
3
WelcomeGeek WelcomeToGeeksForGeeks GeeksForGeeks
WTG

Output:
No match found
WelcomeToGeeksForGeeks
*/
import java.util.*;
public class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<String> words=new ArrayList<String>();
            for(int i=0;i<n;i++)
                words.add(sc.next());
            String pattern=sc.next().toUpperCase();
            System.out.println(calc(words,pattern,n));
        }
        sc.close();
    }
    public static String calc(ArrayList<String> words,String pattern,int n)
    {
        HashMap<String,String> map=new HashMap<String,String>();
        for(int i=0;i<n;i++)
        {
            String item="";
            for(int j=0;j<words.get(i).length();j++)
            {
                if((int)words.get(i).charAt(j)>=65&&(int)words.get(i).charAt(j)<=90)
                    item+=words.get(i).charAt(j);
            }
            map.put(item,words.get(i));
        }
        if(map.containsKey(pattern))
            return map.get(pattern);
        else
            return "No match found";
    }
}
