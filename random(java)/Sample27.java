import java.util.ArrayList;

public class Sample27 {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        list1.add("Element 2");
        list1.add("Element 3");

        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Element 4");
        list2.add("Element 5");
        list2.add("Element 6");

        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);

        
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined ArrayList: " + joinedList);
    }
}


