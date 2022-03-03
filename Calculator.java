import java.util.Scanner;
public class calculator{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = scan.nextInt();
        
        System.out.println("enter num 2");
        int num2 = scan.nextInt();
        
        System.out.println("Enter operator (+,-,*,/)");
        char operator = scan.next().charAt(0);
        
        int result;
        
        switch(operator){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;    
            case '*' :
                result = num1 * num2;
                break;    
            case '/' :
                result = num1 / num2;
                break;
            default:System.out.println("plz enter right operator"); 
            return;
        }
        System.out.println(result);
        }    
    }

