package Tree;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class reversePolishNotation {
    static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        List<String> ll = Arrays.asList("+","-","*","/");
        for(String i : tokens){
            if(!ll.contains(i)) st.push(Integer.parseInt(i));
            else{
                int n2 = st.pop();
                int n1 = st.pop();
                if(i.equals("+")) {
                    st.push(n1 + n2);
                }
                else if(i.equals("-")){
                    st.push(n1-n2);
                }
                else if(i.equals("*")){
                    st.push(n1*n2);
                }
                else if(i.equals("/")){
                    st.push(n1/n2);
                }

            }
        }
        return st.pop();
    }
}
