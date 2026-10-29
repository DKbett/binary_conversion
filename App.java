import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Duplicate the algorithm tobe used in octal and hexadecimal conversion
        //Give the user a chance to choose between the three conversions
        Scanner scanner = new Scanner(System.in);
        String string = "";
        int choice, x;
        System.out.printf("Which conversion do you want  to make :\n1. Binary\n2. Octal\n3. Hexadecimal\n");
        choice = scanner.nextInt();
        System.out.println("What integer would you like to convert?");
        x = scanner.nextInt();

        switch(choice){
        case 1:
          do {
            string = (x % 2) + string;
            x /= 2;
          } while (x > 0);
          System.out.println("Binary: " + string);
          break;
        case 2:
          do {
            string = (x % 8) + string;
            x /= 8;
          } while (x > 0);
          System.out.println("Octal: " + string);
          break;
        case 3:
          do {
            string = (x % 16) + string;
            x /= 16;
          } while (x > 0);
          string = string.replace("10","A");
          string = string.replace("11","B");
          string = string.replace("12","C");
          string = string.replace("13","D");
          string = string.replace("14","E");
          string = string.replace("15","F");
          System.out.println("Hexadecimal: " + string);
          break;
        default:
          System.out.println("Invalid input");
        }
        scanner.close();
    }
}
