package greedy;

class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill: bills) {
            // 有5块了
            if (bill == 5) {
                five++;
                // 收到10块
            } else if (bill == 10) {
                // 如果此时没有5块找，返回false
                if (five == 0) {
                    return false;
                }
                // 有5块找
                five--;
                ten++;
                // 收到20的
            } else {
                // 有5块有10块
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    // 有10块没有5块也没用
                    // 除非此时有三张以上5块的
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
