import java.util.*;
class make_it_beautiful{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            helper(arr);
        }
    }
    public static void helper(int[] arr){
        if(isSame(arr)){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        System.out.print(arr[0] + " ");
        for(int i = 2; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[1]);
        return;
    }
    public static boolean isSame(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[0] != arr[i]){
                return false;
            }
        }
        return true;
    }
}