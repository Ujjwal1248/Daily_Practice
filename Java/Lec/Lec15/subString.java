public class subString {
    public static void main(String[] args) {
        printSubString("ujjwal");
    }
    public static void printSubString(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                System.out.println(s1.substring(i, j));
            }
        }
    }
}
