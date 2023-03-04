package assignment02;

public class CharSetImpl implements CharSet {
    private StringBuilder bldr;

    public CharSetImpl(StringBuilder builderIn) {
        bldr = builderIn;
    }

    @Override
    public boolean addToSet(char e) {
        if (bldr.indexOf("" + e) != -1) {
            return false;
        } else {
            bldr.append(e);
            return true;
        }
    }

    @Override
    public boolean deleteFromSet(char e) {
        int index = bldr.indexOf("" + e);
        if (index == -1) {
            return false;
        } else {
            bldr.deleteCharAt(index);
            return true;
        }
    }

    @Override
    public boolean setContains(char e) {
        return (bldr.indexOf("" + e) != -1);
    }

    @Override
    public int sizeOfSet() {
        return bldr.length();
    }
}