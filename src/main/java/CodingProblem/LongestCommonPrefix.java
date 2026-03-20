package CodingProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        char[] firstString = strs[0].toCharArray();
        char[] lastString = strs[strs.length-1].toCharArray();

        StringBuilder commomPrefix = new StringBuilder();

        for(int i = 0; i< firstString.length;i++){
            if(firstString[i] != lastString[i]) break;
            commomPrefix.append(firstString[i]);
        }

        return commomPrefix.toString();
    }

}
