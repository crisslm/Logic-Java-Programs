package src.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticCalculator {
    
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("---- 2° EQUATION SOLVER ----\n\n");
        
                try{
                    System.out.print("A: ");
                    double A = sc.nextDouble();
                    System.out.print("B: ");
                    double B = sc.nextDouble();
                    System.out.print("C: ");
                    double C = sc.nextDouble();

                    double delta = ((B * B) - (4 * A * C));

                    if(delta < 0){
                        System.out.println("Delta less than zero.");
                        System.out.println("X do not belong to Real numbers");
                    } else{
                        double x1 = ((-B + Math.sqrt(delta))/(2 * A));
                        double x2 = ((-B - Math.sqrt(delta))/(2 * A));
                        System.out.println("\nDelta: " + delta);
                        System.out.println("\nX1: " + x1);
                        System.out.println("\nX2: " + x2); 
                    }

                } catch(InputMismatchException e){
                    System.out.println("Error - Wrong Input: " + e);
                }
            
    }

}