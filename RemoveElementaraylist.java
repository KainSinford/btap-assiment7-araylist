
package assiment7arraylist;
import java.util.ArrayList;
public class RemoveElementaraylist {
    public static void main(String[] args) {
     ArrayList<String> remove  = new ArrayList<String>();
        remove.add("Jim");
        remove.add("Michel");
        remove.add("Karren");
        remove.add("Liam");
        remove.add("Dylan");
        
        System.out.println("---Before remove---" + remove);
        
        remove.remove("Jim");
        
        System.out.println("---After remove---" + remove);
    }
}
