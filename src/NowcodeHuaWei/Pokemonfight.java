package NowcodeHuaWei;

public class Pokemonfight {


    public long Pokemonfight (long HP, long ACK, long HP2, long ACK2) {
        // write code here
        if(HP2 <= ACK){
            return -1;
        }
        if(HP <= ACK2){
            return 1;
        }
        if(HP2 <= 2 * ACK){
            return -1;
        }
        return (long)(Math.ceil((Math.ceil(((double)ACK/ACK2)*HP)+1-HP2)/(HP2 - ACK - HP2%ACK)) + Math.ceil(((double)HP/ACK2)));
    }
}
