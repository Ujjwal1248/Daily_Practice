public class CarClient {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(10000, 200, "Red");
        arr[1] = new Cars(20000, 300, "Blue");
        arr[2] = new Cars(15000, 250, "Black");
        arr[3] = new Cars(12000, 220, "White");
        arr[4] = new Cars(18000, 280, "Green");

        for (Cars car : arr) { // Enhanced for loop to iterate over the array
            System.out.println(car);
        }
        // display(arr);
    }
    public static <T extends Comparable<T>> void Sort(T[] arr){
        for (int turn = 1; turn < arr.length; turn++){
            for (int i = 0; i <= arr.length - turn - 1; i++){
                if (arr[i].compareTo(arr[i+1]) > 0){
                    T temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

 
    public static void display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}