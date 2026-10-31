import java.util.Scanner;
public class Int{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int lim, choice, sum = 0;
       String origNum, revNum;
       System.out.printf("Which of this would you like to convert to a decimal number:\n 1.Binary\n 2.Octal\n 3.Hexadecimal\n");
       choice = scanner.nextInt();

       switch(choice){
       case 1:
        System.out.println("Kindly input the Binary number you would like to convert: ");
        origNum = scanner.next();
        revNum = new StringBuilder(origNum).reverse().toString();
        lim = revNum.length();
        for(int i = 0; i < lim; i++){
          
             sum += (revNum.charAt(i) - '0')*Math.pow(2,i);
           
        }
        System.out.println("The decimal number is : "+sum);

                break;
      case 2:
                System.out.println("Kindly input the Octal number you would like to convert: ");
                origNum = scanner.next();
                revNum = new StringBuilder(origNum).reverse().toString();
                lim = revNum.length();

                for(int i = 0; i < lim; i++){

                    sum += (revNum.charAt(i) - '0')*Math.pow(8,i);

                }
                System.out.println("The decimal number is : "+sum);

                break;
       case 3:
                System.out.println("Kindly input the Hexadecimal number you would like to convert: ");
                origNum = scanner.next();
                revNum = new StringBuilder(origNum).reverse().toString();
                lim = revNum.length();
                for (int i = 0; i < lim; i++) {
                    char c = revNum.charAt(i);
   
                    int digitValue = Character.digit(c, 16); 
    
                 if (digitValue == -1) {
                       System.out.println("Error: Invalid Hexadecimal character '" + c + "'");
                       return; 
             } 
    
   
                  sum += digitValue * Math.pow(16, i);
                }
            System.out.println("The decimal number is : "+sum);
            break;
        default : 
         System.out.println("Invalid Input");

       }


        scanner.close();
    }
}