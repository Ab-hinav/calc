


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to Square Root\nPress 2 for Factorial\nPress 3 for Natural Log\nPress 4 for Power Function\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            double number1;
            switch (choice) {
                case 1:
                    try{
                        System.out.print("Enter the number :");
                        number1 = scanner.nextDouble();

                    }catch(InputMismatchException error){
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Square root is:" + calculator.sqrt2(number1));

                    // do sqrt
                    break;
                case 2:
                    try{
                        System.out.print("Enter the number :");
                        number1 = scanner.nextDouble();

                    }catch(InputMismatchException error){
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Factorial is:" + calculator.fact(number1));

                    // do factorial
                    break;
                case 3:
                    try{
                        System.out.print("Enter the number :");
                        number1 = scanner.nextDouble();

                    }catch(InputMismatchException error){
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("natural log is:" + calculator.log(number1));

                    // do natural log
                    break;
                case 4:
                    double number2;
                    try{
                        System.out.println("Enter the first number :");
                        number1 = scanner.nextDouble();
                        System.out.println("Enter the second number :");
                        number2 = scanner.nextDouble();

                    }catch(InputMismatchException error){
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("power result is :"+ calculator.pow1(number1,number2));

                    // do power
                    break;
                default:
                    System.out.println("thanks for using calculator");

            }
        } while (true);
    }


    public double sqrt2(double number1) {
        double result =0 ;

        try{

            if(number1<0)
                throw new ArithmeticException("Case of -ve root");
            else
                result = Math.sqrt(number1);


        }catch(ArithmeticException error){
            logger.error("[EXCEPTION - SQUARE ROOT] - Cannot be less than ZERO " + error.getLocalizedMessage());
        }finally {
            logger.info("[RESULT - SQUARE ROOT] - " + result);
        }


        return result;
    }

    public double fact(double number1) {
        double result = 1;
        try{
            if(number1 < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN factorial if < 0");
            }

            if(number1 == 0 || number1 == 1) return 1;

            for(int i = 1; i <= number1; i++){
                result *= i;
            }
        }
        catch(ArithmeticException err) {
            logger.info("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of factorial is: " + result);
        }

        return result;
    }


    public double log(double number1) {
        double result = 0;
        try{
            logger.info("Calculating Natural log of " + number1);
            if(number1 <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN log of <= 0");
            }
            else{
                result = Math.log(number1);
            }
        }
        catch(ArithmeticException err){
            logger.info("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of naturalLog is : " + result);
        }
        return result;
    }

    public double pow1(double number1, double number2) {
        double result = 0;

            logger.info("[power] calculating power of two numbers");
            if (number1 == 0 && number2 == 0) {
                return 1;

            } else if (number1 > 0 && number2 == 0) {
                result = 1;
                return 1;
            } else if (number1 <= -1 && number2 == 0) {
                return 1;
            } else {
                result = Math.pow(number1,number2);
            }

        return result;
    }


}
