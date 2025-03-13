import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class leetcodematrix {
    public static void main(String[] args) {
        int buy,sell,profit;
        int[] days={9,1,3,2,6,5};
        int m=days.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] days2=new int[m];
        int[] days3=new int[1];
        ArrayList<Integer> days4 = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            days2[i]=days[i];
        }
        Arrays.sort(days2);
        System.out.println("original array:"+Arrays.toString(days));
        System.out.println("sorted array:"+Arrays.toString(days2));
        days3[0]=days2[0];
        for(int i=0;i<m;i++)
        {
            
           if(days[i]==days3[0])
           break;
           list.add(days[i]); 
        }
        System.out.println("list with lements till left:"+list);
        for(int i=0;i<m;i++)
        {
            if(!list.contains(days2[i]))
            days4.add(days2[i]);
        }
        int size=days4.size();
        System.out.println("sorted modified array:"+days4);
        
        buy=days4.get(0);
        sell=days4.get(size-1);
        profit=sell-buy;
        System.out.println("profit is:"+profit);
        
    }
}
