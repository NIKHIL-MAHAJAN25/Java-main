import java.util.ArrayList;

public class Sample30 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");

        System.out.println("Original ArrayList: " + list);

        
        if (list.contains("Element 3")) {
            System.out.println("Element 3 is in the list.");
        } else {
            System.out.println("Element 3 is not in the list.");
        }
    }
}
