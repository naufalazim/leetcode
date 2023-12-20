/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Solution: 
i- create new array and keep it. 
ii - then I reverse the array. 
iii - use trim() & stringBuilder
 */

public class reverseWords {

    public String reversewords(String s){
        String[] words = s.split(" +");
        //new temp string:
        StringBuilder w = new StringBuilder();

        //reverse:
        for(int i = words.length - 1; i >= 0; i--){
            w.append(words[i]);
            w.append(" ");
        }

        //convert back to string:
        return w.toString().trim();
    }
}
