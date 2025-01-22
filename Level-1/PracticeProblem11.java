import java.util.*;
public class PracticeProblem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double number1 = sc.nextDouble();
        System.out.println("eneter second number");
        double number2 = sc.nextDouble();

        //arithemetic operation
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+(number1+number2)+", "+(number1-number2)+", "+(number1*number2)+", and "+(number1/number2));
        sc.close();
    }
}
