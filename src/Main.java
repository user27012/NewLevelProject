import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> integerList = getIntegerList(N);
        System.out.println("Случайные 10 чисел: ");
        for (Integer number : integerList) {
            System.out.print(number + ", ");
        }
        System.out.println("");
        System.out.println("Минимальное число: ");
        System.out.println(getMinimum(integerList));
    }

    public static LinkedList<Integer> getIntegerList(int N) {
        LinkedList<Integer> integerList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(100);
            integerList.add(randomNumber);
        }

        return integerList;
    }

    public static int getMinimum(LinkedList<Integer> integerList) {
        if (integerList.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(integerList);

        return priorityQueue.peek();
    }
}
