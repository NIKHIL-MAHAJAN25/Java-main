import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample34 {
    public static void main(String[] args) {
        String[] arr={"Java","Pyhton","PHP","C++"};
        System.out.println("Printing array"+Arrays.toString(arr));
        List<String> list=new ArrayList<String>();
        for(String lang:arr)
        {
            list.add(lang);

        }
        System.out.println("List"+list);
    }
}
