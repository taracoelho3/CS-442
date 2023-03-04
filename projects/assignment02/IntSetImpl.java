package assignment02;
import java.util.ArrayList;

public class IntSetImpl extends ArrayList<Integer> implements IntSet {
    private static final long serialVersionUID = 5465283085896313084L;

    @Override
    public boolean addToSet(int e) {
        if (contains(e)) {
            return false;
        } else {
            add(e);
            return true;
        }
    }

    @Override
    public boolean deleteFromSet(int e) {
        return remove(Integer.valueOf(e));
    }

    @Override
    public boolean setContains(int e) {
        return contains(e);
    }

    @Override
    public int sizeOfSet() {
        return size();
    }
}
