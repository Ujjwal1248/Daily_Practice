public class grade {
    public static void main(String[] args) {
        int a = 7;
        if(a>=75){
            System.out.println("A");
        }
        else if(a>=65 && a<75){
            System.out.println("B");
        }
        else if(a>=55 && a<65){
            System.out.println("C");
        }
        else if(a>=45 && a<55){
            System.out.println("D");
        }
        else if(a<45){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
