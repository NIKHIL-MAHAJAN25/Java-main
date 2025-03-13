import java.util.ArrayList;
public class Sample26 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");
        System.out.println("Original ArrayList: " + list);
        list.remove(2);
        System.out.println("array after deletion: "+list);
    }
}
