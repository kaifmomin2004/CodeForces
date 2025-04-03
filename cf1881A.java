// Given a string x
//  of length n
//  and a string s
//  of length m
//  (n⋅m≤25
// ), consisting of lowercase Latin letters, you can apply any number of operations to the string x
// .

// In one operation, you append the current value of x
//  to the end of the string x
// . Note that the value of x
//  will change after this.

// For example, if x=
// "aba", then after applying operations, x
//  will change as follows: "aba" →
//  "abaaba" →
//  "abaabaabaaba".

// After what minimum number of operations s
//  will appear in x
//  as a substring? A substring of a string is defined as a contiguous segment of it.

// Input
// The first line of the input contains a single integer t
//  (1≤t≤104
// ) — the number of test cases.

// The first line of each test case contains two numbers n
//  and m
//  (1≤n⋅m≤25
// ) — the lengths of strings x
//  and s
// , respectively.

// The second line of each test case contains the string x
//  of length n
// .

// The third line of each test case contains the string s
//  of length m
// .

// Output
// For each test case, output a single number — the minimum number of operations after which s
//  will appear in x
//  as a substring. If this is not possible, output −1
// .

// 12
// 1 5
// a
// aaaaa
// 3
// 5 5
// eforc
// force
// 1
// 2 5
// ab
// ababa
// 2
// 3 5
// aba
// ababa
// -1
// 4 3
// babb
// bbb
// 1
// 5 1
// aaaaa
// a
// 0
// 4 2
// aabb
// ba
// 1
// 2 8
// bk
// kbkbkbkb
// 3
// 12 2
// fjdgmujlcont
// tf
// 1
// 2 2
// aa
// aa
// 0
// 3 5
// abb
// babba
// 2
// 1 19
// m
// mmmmmmmmmmmmmmmmmmm
// 5

import java.util.Scanner;

public class cf1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // int n = sc.nextInt();
            // int m = sc.nextInt();
            String dStr = sc.next();
            String sStr = sc.next();
            boolean notFound = true;

            for (int i = 0; i < 6; i++) {
                if (dStr.contains(sStr)) {
                    System.out.println(i);
                    notFound=false;
                    break;
                } else
                    dStr = dStr + dStr;
            }
            if(notFound) System.out.println(-1);
        }
        sc.close();
    }
}
