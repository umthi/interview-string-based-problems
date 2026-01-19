package epam;

import java.util.*;

public class DirectedCycle {

    public static boolean hasCycle(int v, List<List<Integer>> adj) {
        int[] vis = new int[v];
        int[] pathVis = new int[v];

        for(int i=0; i<v; i++) {
            if(vis[i] == 0 && dfsCheck(i, adj, vis, pathVis)) {
                return true;
            }
        }

        return false;
    }

    private static boolean dfsCheck(int node, List<List<Integer>> adj, int[] vis, int[] pathVis) {
        vis[node] = 1;
        pathVis[node] = 1;

        //traverse for adjacent nodes
        for(int ae : adj.get(node)) {
            //when the node is not visited
            if(vis[ae] == 0) {
                if(dfsCheck(ae, adj, vis, pathVis)) {
                    return true;
                }
            }

            //if the node has been previously visited
            // but ae has to be visited on the same path
            else if(pathVis[ae] == 1) {
                return true;
            }
        }

        //backtracking
        pathVis[node] = 0;
        return false;
    }

    public static void main(String[] args) {
        // Number of vertices
        int n = 4;

        // Initialize adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // ======= Test Case 1: Graph with Cycle =======
        // 0 -> 1, 1 -> 2, 2 -> 0 (cycle)
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        System.out.println("Graph 1 has cycle: " + hasCycle(n, adj)); // ✅ true

        // ======= Test Case 2: Graph without Cycle =======
        adj.clear();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // 0 -> 1 -> 2 -> 3 (no cycle)
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        System.out.println("Graph 2 has cycle: " + hasCycle(n, adj)); // ❌ false
    }
}
