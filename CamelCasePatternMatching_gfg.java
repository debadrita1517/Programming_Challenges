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
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG {
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n =sc.nextInt();
            Map<String,List<Character>> map = new HashMap<String, List<Character>>();
            List<String> set = new ArrayList<String>();
            for(int i=0;i<n;i++) { 
                String s=sc.next(); 
                List<Character> list =new ArrayList<>();
                for(char ch:s.toCharArray())
                if(ch>='A'&&ch<='Z')
                    list.add(ch);
                map.put(s, list);
                set.add(s);
            }
            Collections.sort(set, new Comparator<String>() {

                @Override
                public int compare(String o1, String o2) {
                    StringBuilder first =new StringBuilder(),second =new StringBuilder();
                    for(int i=0;i<o1.length();i++) if(o1.charAt(i)>='A'&&o1.charAt(i)<='Z')
                        first.append(o1.charAt(i));
                    for(int i=0;i<o2.length();i++) if(o2.charAt(i)>='A'&&o2.charAt(i)<='Z')
                        second.append(o2.charAt(i));
                    return first.toString().compareTo(second.toString());
                }
            });
            String pattern1 = sc.next();
            List<Character> pattern = new ArrayList<Character>();
            for(char ch:pattern1.toCharArray())
                pattern.add(ch);
            boolean flag = true;
            for(String word:set) {
                int i=0;
                for(Character ch:map.get(word))
                    if(ch==pattern1.charAt(i)) {
                        if(i++==pattern1.length()-1){
                            System.out.print(word+" ");
                            flag = false;
                            break;
                        }
                    }
                    else 
                        break;
                
            }
            if(flag)
                System.out.println("No match found");
            else
                System.out.println();
        }

    }
}
