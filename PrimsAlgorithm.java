import java.util.Scanner;

public class PrimsAlgorithm {
    static void prim(int cost[][], int n) {
        int[] visit = new int[n];
        int a = 0, b = 0, min, mincost = 0, ne = 1;
        // start from the first vertex
        visit[0] = 1;
        while (ne < n) {
            // Find the nearest neighbour
            min = 999;
            for (int i = 0; i < n; i++) {
                if (visit[i] != 0)
                    for (int j = 0; j < n; j++)
                        if (cost[i][j] < min && visit[j] == 0) {
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
            }
            // Include nearest neighbour 'b' into MST
            System.out.println("Edge from vertex " + a + " to vertex " + b + " and the cost " + min);
            visit[b] = 1;
            ne++;
            mincost += min;
            cost[a][b] = cost[b][a] = 999;
        }
        System.out.println("minimum spanning tree cost is " + mincost);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter the no. of vertices");
            n = s.nextInt();

            int[][] c = new int[n][n];
            System.out.println("Enter the adjacency matrix (use 999 for no direct connection)");
            System.out.println("Enter " + n * n + " integers, one at a time:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = s.nextInt();
                }
            }

            prim(c, n);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter only integers.");
        } finally {
            s.close(); // Close the Scanner after use
        }
    }
}