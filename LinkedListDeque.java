/** Performs some basic linked list tests. */
public class LinkedListDeque<T> {
    private class Node {
        public T item;
        public Node next;
        public Node prev;

        // Run as public vs private 
        public Node(T i, Node n, Node p) {
            item = i;
            next = n;
            prev = p;
        }

    }
    
    Node head;
    Node tail;
    int size;

    public LinkedListDeque() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T item){
        head = new Node(item, null, null);
        size += 1;
    }

    public void addLast(T item){
        size += 1;
        tail.next = new Node(item, null, tail);

        // head                 tail
        // (1) -> (2) -> (3) -> (4) -> (5)
        
        
        // head                        tail
        // (1) -> (2) -> (3) -> (4) -> (5) -> (1) ....
        
        tail = tail.next;
    }

    public boolean isEmpty();
    public int size();
    public void printDeque();
    public T removeFirst(){

        head = head.next;
        size -= 1;
    }
    public T removeLast() {
        // head                         tail
        // (1) -> (2) -> (3) -> (4) -> (5)
        
        
        tail = tail.prev;
        size -= 1;        

        // head                 tail
        // (1) -> (2) -> (3) -> (4) //-> (5)//
    }
    public T get(int index);
    public T getRecursive(int index);
}

// LinkedListDeque = new LinkedListDeque("Bulbasaur")
LinkedListDeque.jackShit()
sizeOfList = size(list)
printedList = print(list)
LinkedListDeque = new LinkedListDeque("Ivysaur")

// Bulbasaur
// Ivysaur
// Venosaur