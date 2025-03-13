import java.util.Scanner;
public class Sample10 {
    public static void main(String[] args) 
    {
        String oper;
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Operator");
        oper=input.next();
        System.out.println("Enter number 1");
        a=input.nextInt();
        System.out.println("Enter number 2");
        b=input.nextInt();
        switch(oper)
        {
            case "+" : System.out.println("sum is:"+a+b);
            break;
            case "-" : System.out.println("Difference is:"+(a-b));
            break;
            case "*" : System.out.println("mult is:"+a*b);
            break;
            case "/" : System.out.println("quotient is is:"+(a/b));
            break;
            default:
            System.out.println("invalid operator");
            break;
        }
        input.close();


    }
}
