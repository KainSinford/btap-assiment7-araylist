
package assiment7arraylist;
import java.util.ArrayList;
public class updaearaylst {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.set(2, 100);

        System.out.println("Updated ArrayList: " + numbers);
    }
}
