// You are given a string s
//  of length n
// , consisting of lowercase Latin letters, and an integer k
// .

// You need to check if it is possible to remove exactly k
//  characters from the string s
//  in such a way that the remaining characters can be rearranged to form a palindrome. Note that you can reorder the remaining characters in any way.

// A palindrome is a string that reads the same forwards and backwards. For example, the strings "z", "aaa", "aba", "abccba" are palindromes, while the strings "codeforces", "reality", "ab" are not.

// Input
// Each test consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤104
// ) — the number of the test cases. This is followed by their description.

// The first line of each test case contains two integers n
//  and k
//  (0≤k<n≤105
// ) — the length of the string s
//  and the number of characters to be deleted.

// The second line of each test case contains a string s
//  of length n
// , consisting of lowercase Latin letters.

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2⋅105
// .
// Output
// For each test case, output "YES" if it is possible to remove exactly k
//  characters from the string s
//  in such a way that the remaining characters can be rearranged to form a palindrome, and "NO" otherwise.
// You can output the answer in any case (uppercase or lowercase). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive answers.

import java.util.Scanner;
import java.util.Arrays;

public class cf1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] alpha = new int[26];
        while (t-- > 0) {
            Arrays.fill(alpha, 0);
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int odd = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                if (alpha[s.charAt(i) - 'a'] == 0) {
                    alpha[s.charAt(i) - 'a'] = 1;
                    for (int j = i; j < n; j++)
                        if (s.charAt(i) == s.charAt(j))
                            count++;
                    if (count % 2 == 1)
                        odd++;
                }
            }
            System.out.println(odd - k <= 1 ? "YES" : "NO");
        }
        sc.close();
    }
}
