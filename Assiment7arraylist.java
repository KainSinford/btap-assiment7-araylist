package assiment7arraylist;
import java.util.ArrayList;
public class Assiment7arraylist {
   
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("Michel");
        names.add("Karren");
        names.add("Liam");
        names.add("Dylan");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
