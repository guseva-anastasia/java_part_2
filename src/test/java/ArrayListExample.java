import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println("Добавлен новый элемент в список с именем " + item);
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Удален элемент из списка с именем " + item);
    }

    public void searchItem(String searchItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(searchItem)) {
                System.out.println("Найден элемент " + searchItem);
                return;
            }
        }
        System.out.println("Элемент не найден " + searchItem);
    }


}
