import java.util.Stack;

public class EvaluatePostfix
{
    public static void main(String[] args) 
    {

        Stack<Integer> st = new Stack<>();
        String infix = "55+2*";


        for(int i=0;i<infix.length();i++){

            char ch = infix.charAt(i);

            if(ch >= '0' && ch <= '9')
            {
                st.push(Integer.parseInt(ch+""));
            }
            

            else
            {
                int num2 = st.pop();
                int num1 = st.pop();   

                if(ch == '+') st.push(num1+num2);
                else if(ch == '*') st.push(num1 * num2);
                else if(ch == '/') st.push(num2 / num1);
                else if(ch == '-') st.push(num2 - num1);

            }
        }

        int ans = st.pop();

        System.out.println("The ans is : "+ans);
    }
}
