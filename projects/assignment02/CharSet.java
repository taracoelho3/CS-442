package assignment02;

public interface CharSet {
    boolean addToSet(char e); // adds e to the set if it is NOT already in the set.
    // returns true if e is added, false if e was already in the set.
    boolean deleteFromSet(char e); // removes e from the set if it is in the set.
    // returns true if e was in the set, false if e is not in the set.
    boolean setContains(char e); // returns true if e is in the set, false if not.
    int sizeOfSet(); // the number of elements in the set.
}
