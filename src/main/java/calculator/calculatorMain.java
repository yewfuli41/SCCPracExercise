package calculator;
import java.util.*;
public class calculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        
        int a = sc.nextInt();
       
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        double result = 0;
        switch (op) {
            case "+":
                result = calculator.add(a, b);
                break;
            case "-":
                result = calculator.subtract(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
            default:
                System.out.println("Invalid operator!");
                System.exit(1);
        }

        System.out.println("Result: " + result);
        sc.close();
	}

}
