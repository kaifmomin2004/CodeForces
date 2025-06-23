import java.util.*;

public class cf2120A {

    public static boolean canFormSquare(int l1, int b1, int l2, int b2, int l3, int b3) {
        if (b1 == b2 && b2 == b3 && l1 + l2 + l3 == b1)
            return true;
        if (l1 == l2 && l2 == l3 && b1 + b2 + b3 == l1)
            return true;

        int[][] R = { { l1, b1 }, { l2, b2 }, { l3, b3 } };
        // 3) Try each rectangle as the “base” of the L-shape
        for (int i = 0; i < 3; i++) {
            int lb = R[i][0], bb = R[i][1]; // base’s length and breadth
            int side = Math.max(lb, bb);
            // Check if just this one rectangle ALONE already is the square
            if (lb == side && bb == side) {
                // then the other two must stack perfectly to fill the rest of the side
                int j = (i + 1) % 3, k = (i + 2) % 3;
                int l1p = R[j][0], b1p = R[j][1];
                int l2p = R[k][0], b2p = R[k][1];
                // they must stack vertically: same width and heights sum to side
                if (l1p == l2p && b1p + b2p == side && lb + l1p == side)
                    return true;
                // or stack horizontally: same height and lengths sum to side
                if (b1p == b2p && l1p + l2p == side && bb + b1p == side)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l1 = sc.nextInt(), b1 = sc.nextInt();
            int l2 = sc.nextInt(), b2 = sc.nextInt();
            int l3 = sc.nextInt(), b3 = sc.nextInt();

            if (canFormSquare(l1, b1, l2, b2, l3, b3)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
