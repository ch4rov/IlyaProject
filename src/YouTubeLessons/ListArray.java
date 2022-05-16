package YouTubeLessons;

import java.util.ArrayList;
import java.util.List;

public class ListArray extends Object {
    public static void main(String[] args) {
        List<String> daysOfWeek = new ArrayList();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday ");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        daysOfWeek.add(null);

        byte size = (byte) daysOfWeek.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(daysOfWeek.get(i));
//        }



        daysOfWeek.removeIf(entity -> "Monday".equals(entity));
        daysOfWeek.removeIf(entity -> entity.equals("Monday"));
        for(String str : daysOfWeek) {
            System.out.println(str);
        }
    }
}