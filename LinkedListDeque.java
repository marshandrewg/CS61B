

/** Performs some basic linked list tests. */
public class LinkedListDeque<T> {
    private class Node {
        public T item;
        public Node next;
        public Node prev;

        // Run as public vs private 
        /**
         * Creates a node object
         * @param i item to add to node
         * @param n next Node
         * @param p previous node
         * @return Node object
         */
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
        tail.next = new Node(item, null, tail);

        // head                 tail
        // (1) -> (2) -> (3) -> (4) -> (5)
        
        
        // head                        tail
        // (1) -> (2) -> (3) -> (4) -> (5) -> (1) ....
        
        tail = tail.next;
        size += 1;
    }

    public boolean isEmpty() {
        if(head != null){
            return true;
        }
        return false;
    }
    
    public int size(){
        return size;
    }
    public void printDeque(){

        // head                         tail
        // (1) <-> (2) <-> (3) <-> (4) -> (5)
        Node s = head;
        while(s.next != null) {
            System.out.println(s.item);
            s = s.next;
        }
    }

    public T removeFirst(){
        // head          
        // (1)
        //  <-> (2) <-> (3) <-> (4) -> (5)
        head = head.next;
        //        head                 tail
        //   <- (2) -> (3) -> (4) -> (5)
        if(head != null){
            head.prev = null;
        }

        size -= 1;
    }
    public T removeLast() {
        // head                         tail
        // (1) <-> (2) <-> (3) <-> (4) -> (5)
        
        
        tail = tail.prev;
        size -= 1;        

        // head                 tail
        // (1) -> (2) -> (3) -> (4) //-> (5)//
    }
    public T get(int index){
    
        // out of bounds < >
        // head
        // tail

        int counter = 0;
        Node s = head;
        while(s.next != null) {
            if(counter == index){
                return s.item;
            }
            s = s.next;
            counter += 1;
        }
    }

    public T getRecursive(int index){

    }
}

// LinkedListDeque = new LinkedListDeque("Bulbasaur")
LinkedListDeque.jackShit()
sizeOfList = size(list)
printedList = print(list)
LinkedListDeque = new LinkedListDeque("Ivysaur")

// Bulbasaur
// Ivysaur
// Venosaur