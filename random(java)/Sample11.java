import java.util.Scanner;

public class Sample11 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int sum = 0;
         while (number != 0) {
            sum += number % 10;  
            number = number / 10;  
        }
        System.out.println("Sum of all digits: " + sum);
        
        input.close();
    }
}
        
        
        
        
        
        
        
       
        
        
        
