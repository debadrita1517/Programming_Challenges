/*Given a list of words, each word consists of English lowercase letters.
Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1,
to make it equal to word2.  For example, "abc" is a predecessor of "abac".
A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.
Return the longest possible length of a word chain with words chosen from the given list of words.
Example 1:
Input: words = ["a","b","ba","bca","bda","bdca"]
Output: 4
Explanation: One of the longest word chain is "a","ba","bda","bdca".
Example 2:
Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
Output: 5*/

class Solution
{
    public int longestStrChain(String[] arr)
    {
        if(arr.length<=1)
            return 0;
        else
        {
            int[] len=new int[arr.length];
            int max_len=1;
            for(int i=0;i<arr.length;i++)
            {
                len[i]=arr[i].length();
                if(len[i]>max_len)
                    max_len=len[i];
            }
            int min_len=max_len;
            for(int i=0;i<len.length;i++)
                if(len[i]<min_len)
                    min_len=len[i];
            HashSet<Integer> set=new HashSet<Integer>();
            for(int i=0;i<len.length;i++)
                set.add(len[i]);
            int c=1,max=1,j=min_len+1;
            for(int i=min_len;i<max_len;)
            {
                if(set.contains(i+1))
                {
                    c++;
                    i++;
                }
                else
                {
                    if(c>max)
                        max=c;
                    c=1;
                    i=j++;
                }
                if(c>max)
                    max=c;
            }
            return max;
        }
    }
}
