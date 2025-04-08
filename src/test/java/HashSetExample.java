import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    private Set<Integer> numbers = new HashSet<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeNumber(int number) {
        numbers.remove(number);
    }

    public boolean containsNumber(int searchNumber) {
        if (numbers.size() == 0){
            System.out.println("Нет чисел в списке");
        }
        for (Integer num : numbers) {
            if (num == searchNumber) {
                return true;
            }
        }
        return false;
    }


}
