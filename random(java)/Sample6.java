import java.util.Scanner;
public class Sample6 {
    public static void main(String[] args)
    {
        int m1,m2,m3,sum;
        float perc;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks in Subject 1:");
        m1=input.nextInt();
        System.out.println("Enter marks in Subject 2:");
        m2=input.nextInt();
        System.out.println("Enter marks in Subject 3:");
        m3=input.nextInt();
        sum=m1+m2+m3;
        System.out.println("Sum is:"+sum);
        perc=(sum/300)*100;
        System.out.println("Percentage is:"+perc);
        input.close();
    }
}



    
    

