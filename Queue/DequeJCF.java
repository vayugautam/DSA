import java.util.*;
public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        deque.removeFirst();
        System.out.println(deque);
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());
    }
}
