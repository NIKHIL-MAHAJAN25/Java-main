import java.util.Scanner;
public class Sample4{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num(5)");
        byte num = input.nextByte();
        System.out.println("Enter num(-150)");
        short shrt = input.nextShort();
        System.out.println("Enter num(150000)");
        int a = input.nextInt();
        System.out.println("Enter num(15000000000)");
        long lng = input.nextLong();
        System.out.println("Enter num(213333333333333333333333333333333333)");
        float flt = input.nextFloat();
        System.out.println("Enter num(-100000000000000)");
        double dbl = input.nextDouble();
        System.out.println("Enter String");
        String str = input.nextLine();
        System.out.println(":"+str);
        System.out.println("Enter T or F");
        Boolean bool = input.nextBoolean();
        input.close();
        


    }
}