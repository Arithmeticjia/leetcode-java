package com.company;

import java.util.ArrayList;
import java.util.List;

public class allPathsSourceTarget {

    public static void main(String[] args){
        allPathsSourceTarget test = new  allPathsSourceTarget();
        int [][] u = {{1,2},{3},{3},{}};
        System.out.println(test.allPathsSourceTarget(u));
    }

    public List<List<Integer>> allPathsSourceTarget(int [][] graph){
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        c.add(0);
        dfs(c, r, graph, 0);
        return r;
    }

    public void dfs(List<Integer> c, List<List<Integer>> r, int [][] g, int n) {
        if (n == g.length - 1) {
            r.add(new ArrayList<>(c));
        }
        int[] nbs = g[n];
        for(int nb : nbs) {
            c.add(nb);
            dfs(c, r, g, nb);
            c.remove(c.size() - 1);
        }
    }
}
