package assignment02;

public class CharQueueTest {
    public static void main(String[] args) {
        StringBuilder bldr = new StringBuilder();
        CharQueue set = new CharQueueImpl(bldr);
        set.enQueue('a');
        set.enQueue('b');
        set.enQueue('b');
        set.enQueue('c');
        System.out.println(set.isEmpty());
        System.out.println(set.remove('b'));
        System.out.println(set.deQueue());
        System.out.println(set.deQueue());
        System.out.println(set.deQueue());
        System.out.println(set.isEmpty());
        System.out.println(set.remove('a'));
    }
}