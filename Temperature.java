import java.util.Scanner;

public class Temperature  
 {  
    static Scanner scanner = new Scanner(System.in);

    static double CtoF(double C)
    {
        double F = (C * 9/5) + 32;
        return F;
    }

    static double FtoC(double F)
    {
        double C = (F - 32) * 5/9;
        return C;
    }

    static double input(String word)
    {
        System.out.println("Enter "+word+" value:");
        double val = scanner.nextDouble();
        return val;
    }
      
      // Method to print converted value of temperature
    static void output(double val, String word)
    {
        System.out.printf("%s value: %.2f",word,val);
    }
   public static void main (String args[])  
    { 
         System.out.println("1. Celcius to Fahrenheit");
         System.out.println("2. Fahrenheit to Celcius");
         System.out.println("3. Exit");

         do
         {
            System.out.println("\nEnter Choice: ");
            int ch = scanner.nextInt();
            double num = 0;
            switch(ch)
            {
                case 1:
                num = input("Celcius");
                output(CtoF(num), "Fahrenheit");
                break;

                case 2:
                num = input("Fahrenheit");
                output(FtoC(num), "Celcius");
                break;

                case 3: System.exit(0);
                break;

                default:
                System.out.println("Invalid Input");
            }
         }while(true);
    }
}  