public class IntList {
    public int first;
    public IntList rest;        

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        int size = 0;
        currentRest = rest;
        while(currentRest) {
            size += 1;
            if(rest) {
                currentRest = rest.rest;
            }
        }
        return size;
    }

    public iterativeSize() {

    }
}