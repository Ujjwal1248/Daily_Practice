public class compareTo {
    public static void main(String[] args) {
        // System.out.println("kunal".compareTo("komal"));
        System.out.println(compareTo("kunal", "komal"));
    }
    public static int compareTo(String s1, String s2) {
        if (s1==s2) {
            return 0;
        }
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
