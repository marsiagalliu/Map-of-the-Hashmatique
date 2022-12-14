import java.util.HashMap;
import java.util.Set;

public class HashMapFun {

public static void main(String[] args) {
    
    HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Sorry seems to be the hardest word", "What I got to do...");
        userMap.put("We are The Lucky Ones", "I can't wait for Christmas...");
        userMap.put("All Rise", "Your honour, please, gotta believe what I say...");
        userMap.put("One Love", "It's kinda funny how life can change...");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.print(key + " : ");
            System.out.println(userMap.get(key));    
        }
}
    
}