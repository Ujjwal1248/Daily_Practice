import java.util.*;
class Set_Theory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }
    public static int ven_Diagram(int[] arr, int n){
        int l = arr.length;
        for(int i = 1; i < (1<<l); i++){
            int ans = Power_Set(arr, n, i);
            if(set_bit(i) % 2 == 0){
                count -= ans;
            }
            else{
                count += ans;
            }
        }
        return count;
    }
    public static int Power_Set(int[] arr, int n, int i){
        int ans = 1; 
        int idx = 0;
        while(i > 0){
            if((i & 1) != 0){
                ans = ans * arr[idx];
            }
            idx++;
            i = i >> 1;
        }
        return ans;
    }
    public static int set_bit(int i){
        int count = 0;
        while(i > 0){
            i = (i&(i-1));
            count++;
        }
        return count;
    }
}