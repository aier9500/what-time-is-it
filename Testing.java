import java.util.*;

public class Testing {
    
    public static void main(String[] args) {
        
        Resources resources = new Resources();
        ArrayList<ArrayList<String>> resourceList2D = resources.import2DResources();
        ArrayList<String> resourceList = resources.importResources();
        ArrayList<String> users = resources.getUsers();

        for (String user : users) {

            System.out.println(user);
        }

    }
}
