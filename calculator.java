import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        double firstNum = scan.nextDouble();

        System.out.println("Enter a operator (+, -, *, /)");
        char operator = scan.next().charAt(0);

        System.out.println("Enter Your Second Number");
        double secondNum = scan.nextDouble();

        double result;

        switch(operator){
            case '+':
            result = firstNum + secondNum;
            break;

            case '-':
            result = firstNum - secondNum;
            break;

            case '*':
            result = firstNum * secondNum;
            break;

            case '/':
            result = firstNum / secondNum;
            break;

            default:
            System.out.println("Invalid operator");
            scan.close();
            return;
        }

        System.out.println(firstNum  + " " + operator + " " + secondNum +" = "+ result);
        scan.close();
    }
}
