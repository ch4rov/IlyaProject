import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> IDAndFullName = new HashMap<>();

        IDAndFullName.put(1, "Test");
        IDAndFullName.put(2, "Test");
        System.out.println(IDAndFullName.get(1));
        System.out.println();

        if (IDAndFullName.containsKey(1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        for (Map.Entry entry: IDAndFullName.entrySet()) { System.out.println(entry); }
        System.out.println();

        IDAndFullName.remove(1);

        for (Map.Entry entry: IDAndFullName.entrySet()) { System.out.println(entry); }


//
//        IDAndFullName.put(IDAndFullName.size()+1, "Ilya Goncharov");
//        IDAndFullName.put(IDAndFullName.size()+1, "Ivan Goncharov");
//        IDAndFullName.put(IDAndFullName.size()+1, "Test Goncharov");
//        IDAndFullName.put(IDAndFullName.size()+1, "Vladimir Goncharov");
//
//        System.out.println(IDAndFullName + " " +  IDAndFullName.size());
//
//        System.out.println(IDAndFullName.get(1));
//
//        IDAndFullName.remove(2);
//        System.out.println(IDAndFullName + " " + IDAndFullName.size());
//
//        IDAndFullName.isEmpty();
//
//        for (Map.Entry entry : IDAndFullName.entrySet()) {
//            System.out.println(entry);
//        }
//
//        IDAndFullName.put(IDAndFullName.size()+1, "5 Goncharov");
//        System.out.println(IDAndFullName + " " +  IDAndFullName.size());

    }
}
