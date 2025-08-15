public class palindrom_partition {

    public static void main(String[] args) {

        String str = "nitin";

        System.out.println(isPalindrom(str));

    }

    public static Boolean isPalindrom(String str){

        int I = 0;

        int j = str.length()-1;

        while(I<j){

            if(str.charAt(I) != str.charAt(j)){

                return false;

            }

            I++;

            j--;

        }

        return true;

    }

}