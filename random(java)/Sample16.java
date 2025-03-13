import java.util.Scanner;
public class Sample16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int i,a=0;
        int b=1;
        int sum=0;
        System.out.print("Enter number till you want fibonacci series");
        num=input.nextInt();
        System.out.println("The fibonacci series is 0,1");
        for(i=2;i<num;i++)
        {
            sum=a+b;
            System.out.print(","+sum);
            a=b;
            b=sum;
            
        }
    }
}
