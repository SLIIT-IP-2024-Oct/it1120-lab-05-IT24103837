  import java.util.Scanner;
    public class IT24103837Lab5Q1 {
      public static void main (String [] args) {

    System.out.print("Enter three different integers:");

   Scanner input = new Scanner(System.in);

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

   int smallest = Math.min(num1, Math.min(num2, num3));
   int largest = Math.max(num1, Math.max(num2, num3));

   
    System.out.println("Smallest:" + smallest);
    System.out.println("Largest:" + largest);

    input.close();

   }
}