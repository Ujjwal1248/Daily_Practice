public class Maxinarray {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 100, 20, 2,3,4,1,7,9,8,999};
        System.out.println(maxnumber(arr));
    };
    public static int maxnumber(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
