import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        
        Stack<Character> st = new Stack<>();
        int rank = 0;

        StringBuilder ans = new StringBuilder();

        StringBuilder infix = new StringBuilder();
        infix.append("(a+b*c/d-e+f/g/(h+i))");

        infix.reverse();

        for (int i = 0; i < infix.length(); i++) {
            if (infix.charAt(i) == '(') {
                infix.setCharAt(i, ')');
            } else if (infix.charAt(i) == ')') {
                infix.setCharAt(i, '(');
            }
        }


        for(int i=0; i<infix.length() ;i++){
            if(infix.charAt(i) == '('){
                st.push('(');
            }
            else if(Character.isAlphabetic(infix.charAt(i))){
                ans.append(infix.charAt(i));
            }
            else if(infix.charAt(i) == '+' || infix.charAt(i) == '-' || infix.charAt(i) == '/' || infix.charAt(i) == '*' || infix.charAt(i) == '^'){
                while(!st.empty() && st.peek() != '(' && precidence(st.peek()) > precidence(infix.charAt(i)) ){
                    ans.append(st.pop());
                }
                st.push(infix.charAt(i));
            }

            else{
                while(st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }

        }
        
        while(!st.empty()){
            st.pop();
        }
        ans.reverse();
        System.out.println("ans is : "+ans);
    }


    public static int precidence(char ch){

        switch (ch) {
            case '+' :
            case '-' : 
                return 1;      
            
            case '/' :
            case '*' :
                return 2;

            case '^' :
                return 3;
        }

        return -1;
    }
}
