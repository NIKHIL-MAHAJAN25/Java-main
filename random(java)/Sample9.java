import java.util.Scanner;
public class Sample9 {
    public static void main(String[] args) {
        int i,j,num;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of rows");
        num=input.nextInt();
        for(i=0;i<num;i++){
        
            for(j=0;j<num-i;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
