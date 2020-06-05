/**
 * Class for storing linked list of ints
 */
public class IntList {
    public int first;
    public IntList rest;        

    /**
     * Creates new IntList
     * @param f int to store
     * @param r rest of list
     */
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * Recursive size function
     * @return int size of list
     */
    public int size() {
        if( rest == null ){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Iterative size function
     * @return int size of list
     */
    public int iterativeSize() {
        int size = 0;
        IntList currentRest = rest;
        while(currentRest != null) {
            size += 1;
            if(currentRest.rest != null) {
                currentRest = currentRest.rest;
            } else {
                return size;
            }
        }
        return size;
    }
}