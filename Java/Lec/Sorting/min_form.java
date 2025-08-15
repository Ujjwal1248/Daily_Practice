public class min_form {
    public static void main(String[] args) {
        int [] arr = {4,-1,5,3,2,1,7};
        System.out.println(min_form_ith_index(arr,2));
    }
    public static int min_form_ith_index(int [] arr, int i){
        int min = i;
        for(int j =i+1;j<arr.length;j++){
            if(arr[j] <arr[min]){
                min = j;
            }
        }
        return min;
    }

}
