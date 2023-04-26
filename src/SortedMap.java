import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(2, "Ian");
        idToName.put(14234, "Johnson");
        idToName.put(875, "Joe");
        idToName.put(5, "Kevin");
        idToName.put(124565, "Peter");
        System.out.println("unsorted map : " + idToName);
        // Sorting Map by keys
        TreeMap<Integer, String> sorted = new TreeMap<>(idToName);
        System.out.println("sorted map : " + sorted);
    }
}
