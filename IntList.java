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
            if(currentRest.rest) {
                currentRest = currentRest.rest;
            } else {
                return size;
            }
        }
        return size;
    }

    public iterativeSize() {

    }
}