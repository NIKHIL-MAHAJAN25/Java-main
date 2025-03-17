import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
            hs.add(10);
            hs.add(20);
            hs.add(30);
            hs.add(40);
            System.out.println("Hashedsets"+hs);
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
            lhs.add("Java");
            lhs.add("Python");
            lhs.add("PHP");
            lhs.add("C++");
            System.out.println("LinkedHashedsets"+lhs);
        TreeSet<Integer> ts = new TreeSet<Integer>();
            ts.add(22);
            ts.add(33);
            ts.add(4);
            ts.add(5);
            System.out.println("TreeSets"+ts);
            System.out.println(ts.ceiling(23));
            System.out.println(ts.higher(4));
        }
}
