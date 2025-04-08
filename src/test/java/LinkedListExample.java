import java.util.LinkedList;

public class LinkedListExample {
    private LinkedList<String> items = new LinkedList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public boolean searchItem (String searchItem) {
        int index = 0;
        while (index < items.size()) {
            if (items.get(index) == searchItem) {
                return true;
            }
            index++;
        }
        return false;
    }

}
