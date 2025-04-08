import java.util.LinkedList;

public class LinkedListExample {
    private LinkedList<Double> items = new LinkedList<>();

    public void addItem(double item) {
        items.add(item);
    }

    public boolean removeItem(double item) {
        return items.removeFirstOccurrence(item);
    }

    public boolean searchItem (double searchItem) {
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
