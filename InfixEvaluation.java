package dsaCode;
import java.util.*;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression: ");
        String exp = sc.nextLine();
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch - '0');  //char to int
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }
        while (optors.size() != 0) {
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }
        System.out.println(opnds.peek());
    }

        public static int precedence(char optor){
            if (optor=='+'){
                return 1;
            } else if (optor=='-') {
                return 1;
            } else if (optor=='*') {
                return 2;
            }else{
                return 2;
            }
        }

        public static int operation(int v1,int v2,char optor){
            if (optor=='+'){
                return v1 + v2;
            } else if (optor=='-') {
                return v1 - v2;
            } else if (optor=='*') {
                return v1 * v2;
            }else{
                return v1 / v2;
            }
        }
    }

