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
        List<List<Integer>> allpath = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(path, allpath, graph, 0);
        return allpath;
    }
    // n是当前节点
    public void dfs(List<Integer> path, List<List<Integer>> allpath, int [][] g, int n) {
        if (n == g.length - 1) {
            allpath.add(new ArrayList<>(path));
        }
        int[] nbs = g[n];
        for(int nb : nbs) {
            path.add(nb);
            dfs(path, allpath, g, nb);
            path.remove(path.size() - 1);
        }
    }
}
