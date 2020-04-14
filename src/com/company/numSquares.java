package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class numSquares {

    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(n);
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int len = queue.size();
            for(int i = 0;i < len;i++){
                int node = queue.remove();
                for(int j = 1; j * j <= node;j++){
                    int next = node = j * j;
                    if(next == 0){
                        return level;
                    }
                    if(!visited.contains(next)){
                        visited.add(next);
                        queue.add(next);
                    }
                }
            }
        }
        return level;
    }
}
