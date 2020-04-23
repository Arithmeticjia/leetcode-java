package greedy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class robotSim {

    public static void main(String[] args){
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2,4}};
        System.out.println(new robotSim().robotSim(commands,obstacles));
    }

    public int robotSim(int[] commands, int[][] obstacles){
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int x = 0, y = 0;
        int dir_index = 0;
        int ans = 0;
        Set<String> blockSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            blockSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int command : commands) {
            // 右转90
            if (command == -1) {
                dir_index = (dir_index + 1) % 4;
            } else if (command == -2) {
                dir_index = (dir_index + 3) % 4;
            } else if (command > 0) {
                for (int j = 1; j <= command; j++) {
                    int next_x = x + dir[dir_index][0];
                    int next_y = y + dir[dir_index][1];
                    if (blockSet.contains(next_x + "," + next_y)) {
                        break;
                    } else {
                        x = next_x;
                        y = next_y;
                        ans = Math.max(ans, x * x + y * y);
                    }
                }
            }
        }
        return ans;
    }

}
