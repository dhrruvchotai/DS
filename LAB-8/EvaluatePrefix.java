import java.util.Stack;

public class EvaluatePrefix {
    public static void main(String[] args) 
    {

        Stack<Integer> st = new Stack<>();
        String infix = "/42";


        for(int i=infix.length() -1 ;i>=0;i--){

            char ch = infix.charAt(i);

            if(ch >= '0' && ch <= '9')
            {
                st.push(Integer.parseInt(ch+""));
            }


            else
            {
                int num1 = st.pop();
                int num2 = st.pop();   

                if(ch == '+') st.push(num1+num2);
                else if(ch == '*') st.push(num1 * num2);
                else if(ch == '/') st.push(num1 / num2);
                else if(ch == '-') st.push(num1 - num2);

            }
        }

        int ans = st.pop();

        System.out.println("The ans is : "+ans);
    }
}
