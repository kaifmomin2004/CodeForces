// A 10×10
//  target is made out of five "rings" as shown. Each ring has a different point value: the outermost ring — 1 point, the next ring — 2 points, ..., the center ring — 5 points.

// Vlad fired several arrows at the target. Help him determine how many points he got.

// Input
// The input consists of multiple test cases. The first line of the input contains a single integer t
//  (1≤t≤1000
// ) — the number of test cases.

// Each test case consists of 10 lines, each containing 10 characters. Each character in the grid is either X
//  (representing an arrow) or .
//  (representing no arrow).

// Output
// For each test case, output a single integer — the total number of points of the arrows.

import java.util.Scanner;

public class cf1873C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                String s = sc.next();
                int p = Math.min(i, 9 - i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'X') {
                        score += Math.min(p, Math.min(j, 9 - j)) + 1;

                        // Below is the old way of doing it
                        // if (i == 0 || i == 9 || j == 0 || j == 9) {
                        // score += 1;
                        // } else if (i == 1 || i == 8 || j == 1 || j == 8) {
                        // score += 2;
                        // } else if (i == 2 || i == 7 || j == 2 || j == 7) {
                        // score += 3;
                        // } else if (i == 3 || i == 6 || j == 3 || j == 6) {
                        // score += 4;
                        // } else if (i == 4 || i == 5 || j == 4 || j == 5) {
                        // score += 5;
                        // }
                    }
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}
