package Day1.Day3.Day4;

public class Solution1 {
    static class Solution {
        public boolean backspaceCompare(String s, String t) {
            return getString(s).equals(getString(t));
        }

        private String getString(String s) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '#') {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "ab#c";
        String t1 = "ad#c";
        boolean result1 = solution.backspaceCompare(s1, t1);
        System.out.println("Are strings equal after backspace processing? " + result1); // Output: Are strings equal after backspace processing? true

        String s2 = "ab##";
        String t2 = "c#d#";
        boolean result2 = solution.backspaceCompare(s2, t2);
        System.out.println("Are strings equal after backspace processing? " + result2); // Output: Are strings equal after backspace processing? true

        String s3 = "a##c";
        String t3 = "#a#c";
        boolean result3 = solution.backspaceCompare(s3, t3);
        System.out.println("Are strings equal after backspace processing? " + result3); // Output: Are strings equal after backspace processing? true

        String s4 = "a#c";
        String t4 = "b";
        boolean result4 = solution.backspaceCompare(s4, t4);
        System.out.println("Are strings equal after backspace processing? " + result4); // Output: Are strings equal after backspace processing? false
    }
}
