import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    private LinkedList<String> items = new LinkedList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public boolean searchItem (String searchItem) {
        ListIterator<String> iterator = items.listIterator();
        do {
            if (iterator.next().equals(searchItem)) {
                return true;
            }
        } while (iterator.hasNext());
        return false;
    }

}
