import java.util.ArrayList;
import java.util.Collections;

public class Java_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("Blue");
        stringArr.add("Yellow");
        stringArr.add("Green");
        for (String i : stringArr){
            System.out.println(i);
        }

        stringArr.addFirst("Purple");
        String element = stringArr.get(0);
        System.out.println("\n" + element);

        stringArr.set(3, "Red");
        System.out.println("\n" + stringArr.getLast());

        stringArr.remove(2);

        System.out.println("\n" + stringArr.contains("Purple"));

        Collections.sort(stringArr);
        System.out.println("\n" + stringArr);

        ArrayList optArr = (ArrayList) stringArr.clone();
        System.out.println("\n" + optArr);
        System.out.println("\n" + stringArr);

        Collections.reverse(optArr);
        System.out.println("\n" + optArr);

        System.out.println(stringArr.equals(optArr));

        optArr.clear();

        System.out.println(optArr.isEmpty());

        stringArr.ensureCapacity(10);

        stringArr.trimToSize();
    }
}
