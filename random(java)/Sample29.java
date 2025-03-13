import java.util.LinkedList;
public class Sample29 {
    public static void main(String[] args) {
        LinkedList<String> orlist=new LinkedList<>();
        orlist.add("Element 1");
        orlist.add("Element 2");
        System.out.println("Original list"+orlist);
        LinkedList<String> colist=new LinkedList<>(orlist);
        System.out.println("Copied list"+colist);
    }
}
