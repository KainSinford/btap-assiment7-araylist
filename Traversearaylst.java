
package assiment7arraylist;
import java.util.ArrayList;
public class Traversearaylst {
    public static void main(String[] args) {
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hanoi");
        cities.add("Ho Chi Minh City");
        cities.add("Da Nang");
        cities.add("Hai Phong");
        cities.add("Can Tho");
        for (String city : cities) {
            System.out.println(city);
        }

        
    }
    
}
