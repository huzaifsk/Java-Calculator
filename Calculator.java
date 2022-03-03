import java.util.Scanner;
public class calculator{
    
    public static int addition(int num1,int num2){
        return num1 + num2;
    }
    public static int substraction(int num1,int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1,int num2){
       return num1 * num2;
    } 
    public static int division(int num1,int num2){
        return num1 / num2;
    }   
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for( ; ; ){
            System.out.println("choose operation: \n" + 
            "1) Addition \n" + "2) Substraction \n" + "3) Multition \n" + "4) Division \n" );
            int operator = scan.nextInt();

            System.out.println("enter num 1");
            int num1 = scan.nextInt();

            System.out.println("enter num 2");
            int num2 = scan.nextInt(); 
            
        
            int result;


        
            switch(operator){
                case 1:
                    result = addition(num1, num2);
                    System.out.println("the answer is: " + result + "\n");
                    break;
                case 2 :
                    result = substraction(num1, num2);
                    System.out.println("the answer is: " + result + "\n");
                    break;    
                case 3 :
                    result = multiplication(num1, num2);
                    System.out.println("the answer is: " + result + "\n");
                    break;    
                case 4 :
                    result = division(num1, num2);
                    System.out.println("the answer is: " + result + "\n");
                    break;
                default:
                    System.out.println("plz enter right operator \n"); 
                    break;    
            }
                
            System.out.println("Would you Like to continue : Y / N ?");
            char choice = scan.next().charAt(0);
            if(choice == 'N' ||choice == 'n'){
                  break;  
            }
        }
    }
}
