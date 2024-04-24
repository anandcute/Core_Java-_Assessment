
import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("********Welcome to the mini calc*********\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number:  ");
        double b = scanner.nextDouble();
        System.out.println("SELECT ANY ONE OPERATOR\n");
        while (true) {
            System.out.println(" 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.Division \n 5.Modulo \n 6.Exit");
            System.out.print("Yours choice is : ");
            int results = scanner.nextInt();
            try {

                switch (results) {
                    case 1:
                        System.out.println(a + "+" + b + "=" + (a + b));
                        break;
                    case 2:
                        System.out.println(a + "-" + b + "= " + (a - b));
                        break;
                    case 3:
                        System.out.println(a + "*" + b + "= " + (a * b));
                        break;
                    case 4:
                        if (b == 0)
                            throw new ArithmeticException("Error! should not divide zero");
                        System.out.println(a + "/" + b + "= " + (a / b));
                        break;
                    case 5:
                        System.out.println(a + "%" + b + "= " + (a % b));
                        break;
                    case 6 :
                            System.out.println("Exiting..........!");
                            System.exit(results);
                    default:
                        System.out.println("\n pls enter  correct choice");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error! Incorrect input " + e);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Thank you ! \n");
            }

        }
        
    }
   
}
