package str;

public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs){
        String ans = strs[0];
        for(int i = 0;i < strs.length;i++){
            // indexOf
            // 查找有没有这个字符串，有的话返回字符串第一个出现的下标
            while(strs[i].indexOf(ans) != 0){
                ans = ans.substring(0,ans.length()-1);
                if(ans.isEmpty()){
                    return "";
                }
            }
        }
        return ans;
    }
}
