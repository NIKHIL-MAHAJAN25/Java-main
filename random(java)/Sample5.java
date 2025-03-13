import java.util.Scanner;

public class Sample5{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);
        a = a + b;  
        b = a - b; 
        a = a - b;  
        System.out.println("After Swapping: a = " + a + ", b = " + b);
        input.close();
        
    }
}
        
        
        

        
        
        
        

        
        