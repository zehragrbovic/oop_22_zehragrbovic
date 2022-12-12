import java.util.HashMap;

public class task1 {
    
    public static void main(String[] args) {
        
        HashMap<String, String> object = new HashMap<String, String>();
        
        object.put("matti", "mage");
        object.put("mikael", "mixu");
        object.put("arto", "arppa");

        System.out.println(object.get("mikael"));
    }

}
