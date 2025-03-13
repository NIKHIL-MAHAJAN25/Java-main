import java.util.Scanner;
public class Sample14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i;
        double n;
        System.out.println("Enter Number");
        n=input.nextInt();
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            System.out.println("number is not prime");
            else
            System.out.println("Number is prime");
        }
        input.close();
    }
    
}
