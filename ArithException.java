import java.util.Scanner;
public class ArithException {
    public static void divide(int a, int b){
        int div=a/b;
        System.out.println("Result: " + div);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number(numerator): ");
        int a = sc.nextInt();
        System.out.print("Enter second number(denominator): ");
        int b = sc.nextInt();
        try {
            divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception=> "+e.getMessage());
        }
        sc.close();
    }
}
