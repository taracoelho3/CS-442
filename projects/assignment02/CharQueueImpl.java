package assignment02;

public class CharQueueImpl implements CharQueue {
    private StringBuilder bldr;

    public CharQueueImpl(StringBuilder builderIn) {
        bldr = builderIn;
    }

    @Override
    public char deQueue() {
        if (bldr.length() == 0) {
            return (char) 0;
        } else {
            char remove = bldr.charAt(0);
            bldr.deleteCharAt(0);
            return remove;
        }
    }

    @Override
    public void enQueue(char c) {
        System.out.println("added " + c);
        bldr.append(c);
    }

    @Override
    public boolean isEmpty() {
        return (bldr.length() == 0);
    }

    @Override
    public boolean remove(char c) {
        int index = bldr.indexOf("" + c);
        if (index == -1) {
            return false;
        } else {
            bldr.deleteCharAt(index);
            return true;
        }
    }
}
