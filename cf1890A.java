// An array b1,b2,…,bn
//  of positive integers is good if all the sums of two adjacent elements are equal to the same value. More formally, the array is good if there exists a k
//  such that b1+b2=b2+b3=…=bn−1+bn=k
// .

// Doremy has an array a
//  of length n
// . Now Doremy can permute its elements (change their order) however she wants. Determine if she can make the array good.

// Input
// The input consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤100
// ) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (2≤n≤100
// ) — the length of the array a
// .

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (1≤ai≤105
// ).

// There are no constraints on the sum of n
//  over all test cases.

// Output
// For each test case, print "Yes" (without quotes), if it is possible to make the array good, and "No" (without quotes) otherwise.

// You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.

// 5
// 2
// 8 9
// Yes
// 3
// 1 1 2
// Yes
// 4
// 1 1 4 5
// No
// 5
// 2 3 3 3 3
// No
// 4
// 100000 100000 100000 100000
// Yes

import java.util.Scanner;

public class cf1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            boolean goodArray = true;

            int n = sc.nextInt();
            int a = 0, b = 0, cntA = 0, cntB = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (a == 0 || x == a) {
                    a = x;
                    cntA++;
                } else if (b == 0 || x == b) {
                    b = x;
                    cntB++;
                } else
                    goodArray = false;
            }

            if (cntA != cntB && cntA + 1 != cntB && cntA != cntB + 1 && cntA != 0 && cntB != 0) 
                goodArray = false;

            System.out.println(goodArray ? "Yes" : "No");
        }
        sc.close();
    }
}
