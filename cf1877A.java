// There are n
//  teams in a football tournament. Each pair of teams match up once. After every match, Pak Chanek receives two integers as the result of the match, the number of goals the two teams score during the match. The efficiency of a team is equal to the total number of goals the team scores in each of its matches minus the total number of goals scored by the opponent in each of its matches.

// After the tournament ends, Pak Dengklek counts the efficiency of every team. Turns out that he forgot about the efficiency of one of the teams. Given the efficiency of n−1
//  teams a1,a2,a3,…,an−1
// . What is the efficiency of the missing team? It can be shown that the efficiency of the missing team can be uniquely determined.

// Input
// Each test contains multiple test cases. The first line contains an integer t
//  (1≤t≤500
// ) — the number of test cases. The following lines contain the description of each test case.

// The first line contains a single integer n
//  (2≤n≤100
// ) — the number of teams.

// The second line contains n−1
//  integers a1,a2,a3,…,an−1
//  (−100≤ai≤100
// ) — the efficiency of n−1
//  teams.

// Output
// For each test case, output a line containing an integer representing the efficiency of the missing team.

// 2
// 4
// 3 -4 5
// 11
// -30 12 -57 7 0 -81 -68 41 -89 0

// -4
// 265

import java.util.Scanner;
public class cf1877A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count=0;
            for(int i=0; i<n-1; i++)
                count+=sc.nextInt();
            System.out.println(0-count);
        }
        sc.close();
    }
}
