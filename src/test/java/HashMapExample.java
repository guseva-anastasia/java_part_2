import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    private Map<String, Integer> itemData = new HashMap<>();

    public void addItemPrice (String item, int price) {
        itemData.put(item, price);
    }

    public void removePrice(int price) {
        itemData.remove(price);
    }

    public boolean searchItem(String item) {
        Iterator<Map.Entry<String, Integer>> itr = itemData.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getKey().equals(item)) {
                return true;
            }
        }
        return false;
    }


}
