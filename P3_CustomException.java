import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}
public class P3_CustomException {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age must be 18 or more than 18....");
        }
        System.out.println("it's a valid age....");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("please enter your age here--> ");
            int age = sc.nextInt();
            validateAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("please enter numeric number only......");
        }
        sc.close();
    }
}