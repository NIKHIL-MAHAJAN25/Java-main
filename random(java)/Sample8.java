
import java.util.Scanner;

public class Sample8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius" + celsius);
        input.close();
    }
}

        




