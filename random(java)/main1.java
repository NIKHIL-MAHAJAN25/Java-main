import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Strings;

public class main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter max");
        int max = sc.nextInt();
        int[] ban = {2,4}; // k index
        ArrayList<String> Main_list =new ArrayList<>();
        for (int i = 0 ; i<n ; i++)
        {
            Main_list.add(String.valueOf(i+1));
        }
        System.out.println(Main_list);

        for (int k = 0 ; k<ban.length ; k++)
        {
            Main_list.remove(String.valueOf(ban[k]));
        }
        System.out.println(Main_list);
                
    }
}
