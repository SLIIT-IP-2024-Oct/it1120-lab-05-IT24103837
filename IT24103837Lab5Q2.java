  import java.util.Scanner;
    public class IT24103837Lab5Q2 {
      public static void main (String[] args) {
 
    Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of new members introduced:");

     int members = input.nextInt();

  if (members < 0 ) {
    System.out.println("Invalid input ! Number of members must be 0 or more.");
    } else {

     String prize;
  
   switch (members) {

     case 0:
       prize = "No prize ";
         break;

     case 1:
      prize = "pen"; 
      break;

     case 2:
      prize = "Umbrella";
      break;

     case 3:
      prize = "Bag";
       break;

      case 4:
      prize = "Travelling Chair";
       break;

      default:
       prize = "Headphone";
   
     }

    System.out.println("You are entitled to: " + prize);

  }

   input.close();

    }

}








