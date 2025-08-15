public class insertLastElement {
    public static void main(String[] args) {

    }
    public static int InsertLastElemen(int[] arr, int i) {
        int item = arr[i];
        int j = i-1;
        while(j>=0&&arr[i]>item){
            arr[i+1] = arr[i];
            arr[j]= item;
            j--;
        }
        return item;
    }
}
