package Day1.Day5;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        int[] hash = new int[26];
        for (char c : p.toCharArray()) {
            hash[c - 'a']++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right) - 'a'] > 0) {
                count--;
            }
            hash[s.charAt(right) - 'a']--;
            right++;
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length()) {
                if (hash[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                hash[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Day1.Day3.Day4.Solution1 solution = new Day1.Day3.Day4.Solution1();

        String s1 = "cbaebabacd";
        String p1 = "abc";
        List<Integer> result1 = solution.findAnagrams(s1, p1);
        System.out.println("Anagram indices for s1 and p1: " + result1);

        String s2 = "abab";
        String p2 = "ab";
        List<Integer> result2 = solution.findAnagrams(s2, p2);
        System.out.println("Anagram indices for s2 and p2: " + result2);
    }
}

