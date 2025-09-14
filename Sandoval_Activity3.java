import java.util.Scanner;
public class Sandoval_Activity3 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

         String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
          
         char choice;  
            do {
                System.out.print("Enter month (1-12): ");
                int month = scanner.nextInt();

                System.out.print("Enter day: ");
                int day = scanner.nextInt();

                System.out.print("Enter Birth Year: ");
                int year = scanner.nextInt();

                if (month >= 1 && month <= 12) {
                    System.out.println("Date: " + months[month - 1] + " " + day + ", " + year);
                } else {
                    System.out.println("Invalid month entered!");
                }

                System.out.print("Do you want to enter another date? (Y/N): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'Y' || choice == 'y');

            scanner.close();
        }                           
}