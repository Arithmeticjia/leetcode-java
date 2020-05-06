package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(new groupThePeople().groupThePeople(groupSizes));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer,ArrayList<Integer>> groups = new HashMap<>();
        for(int i = 0;i < groupSizes.length;i++){
            // 不包含，新建一个arraylist
            if(!groups.containsKey(groupSizes[i])){
                ArrayList<Integer> nids = new ArrayList<>();
                nids.add(i);
                groups.put(groupSizes[i],nids);
            }else {
                ArrayList<Integer> ids = groups.get(groupSizes[i]);
                ids.add(i);
                groups.put(groupSizes[i],ids);
            }
        }
        System.out.println(groups);
        // 遍历hashmap
        for(Map.Entry<Integer,ArrayList<Integer>> entry:groups.entrySet()){
            // 遍历每一个字典（类似）
            for(int i = 0; i < entry.getValue().size();){
                List<Integer> temp = new ArrayList<>(3);
                for(int j = i;j < entry.getKey() + i;j++){
                    if(j > entry.getValue().size()-1){
                        break;
                    }
                    temp.add(entry.getValue().get(j));
                }
                ans.add(temp);
                i += entry.getKey();
            }
        }
        return ans;
    }
}
