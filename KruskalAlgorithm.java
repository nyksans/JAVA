PROGRAM 5: Optimal Road Network
Using greedy technique find a Minimum Cost Spanning Tree. Use Union-Find Data Structure to detect cycles during the execution of the algorithm.

import java.util.Scanner;

public class KruskalAlgorithm {

     static void kruskal(int cost[][],int n)
    {
        int[] par = new int[n];
        for(int i=0;i<n;i++)
            par[i]=-1;
        int a=0,b=0,u=0,v=0,min, mincost = 0, ne = 0;
        
        System.out.println("the minimum spanning tree edges are...");
        while(ne < n-1)   
        {  
            //Find the least cost edge
	    min = 999;
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(cost[i][j] < min)
                    {  
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                    }

            //Check if edge select cause cyclicity?
	    while(par[u]!=-1)
                u=par[u];

            while(par[v]!=-1)
                v=par[v];
      
            if(u!=v)
            {	
                System.out.println("from vertex  "+ a +" to vertex  " + b +" and the cost =   "+min);
                mincost+=min;
                par[b]=a; 
                ne++;
            }
            //edge included in MST should not be considered for next iteration
	    cost[a][b]=cost[b][a]=999;
        }
        System.out.println("Cost of MST ="+mincost);
    }

    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
  
        System.out.println("Enter the no. of vertices");
        n = s.nextInt();
        int[][] c = new int[n][n];
        System.out.println("Enter the cost matrix 999 for self loop/no edge");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                c[i][j]=s.nextInt();
        kruskal(c,n);
    }

}

OUTPUT:
Enter the no. of vertices
5
Enter the cost matrix 999 for self loop/no edge
999 5 999 6 999
5 999 1 3 9999
99 1 999 4 6
6 3 4 999 29
99 999 6 2 999
the minimum spanning tree edges are...
from vertex  1 to vertex  2 and the cost =   1
from vertex  4 to vertex  3 and the cost =   2
from vertex  1 to vertex  3 and the cost =   3
from vertex  0 to vertex  1 and the cost =   5
Cost of MST =11
