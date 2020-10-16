/** Performs some basic linked list tests. */
public class LinkedListDeque<T> {
    private class Node {
        public T item;
        public Node next;

        public Node(T i, Node n) {
            item = i;
            next = n;
        }

    }
    
    public LinkedListDeque() {
    }
    public void addFirst(T item);
    public void addLast(T item);
    public boolean isEmpty();
    public int size();
    public void printDeque();
    public T removeFirst();
    public T removeLast();
    public T get(int index);
    public T getRecursive(int index);
}