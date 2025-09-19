    public class Calculator {
        public static void main(String[] args) {
            float num1=10;
            float num2=5;
            char operator='+';
            float result;
            switch (operator) {
                case '+':
                    result=num1+num2;
                    break;
                    case '-':
                    result=num1-num2;
                    break;
                    case '*':
                    result=num1*num2;
                    break;  
                    case '/':
                    result=num1/num2;
                    break;
                    default: System.err.println("inavalid operator");
                    return;
            }
            System.err.println("Result: "+result);

            
            
        }
        
    }
