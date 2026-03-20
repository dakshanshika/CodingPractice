package Practice;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PermutationInString {

//    Explanation:
//Substring "ba" in s2 is a permutation of "ab".

    public static boolean checkInclusion(String s1, String s2) {

    int[] s1Count = new int[26];
    int[] windowCount = new int[26];

    int windowLen = s1.length();

    for(int i=0; i<windowLen; i++){
        s1Count[s1.charAt(i)-'a']++;
        windowCount[s2.charAt(i)-'a']++;
    }

    for(int i=0; i<s2.length()-windowLen; i++){

        if(isMatch(s1Count,windowCount)) return true;
        windowCount[s2.charAt(i+windowLen)-'a']++;
        windowCount[s2.charAt(i)-'a']--;
    }
        return isMatch(s1Count,windowCount);
    }

    public static boolean isMatch(int[]a, int[]b){

//        for(int i=0; i<26; i++){
//            if(a[i] != b[i]) return false;
//        }
        return Arrays.equals(a,b);
    }

    public static void main(String[] args) {
        String s1 = "abco";
        String s2 = "eidbbbacooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
