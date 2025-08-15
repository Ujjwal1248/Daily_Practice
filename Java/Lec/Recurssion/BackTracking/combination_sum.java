import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] coin = {2,3,6,7};
        int target = 7;
        List<Integer> l1 = new ArrayList<>();
        Combination(coin, target,l1,0);
    }
    public static void Combination(int[] coin, int amount, List<Integer> l1, int idx) {
        if(amount == 0){
            System.out.println(l1);
            return;
        }
        for(int i=idx; i<coin.length; i++) {
            if(amount >= coin[i]) {
                l1.add(coin[i]);
                Combination(coin, amount-coin[i], l1, i);
            }
        }
    }
}
