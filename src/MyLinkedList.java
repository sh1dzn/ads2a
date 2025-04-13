public class MyLinkedList<T> implements MyList<T> {
    class Node {
        T element;
        Node next, prev;
        Node(T element) { this.element = element; }
    }
    Node head, tail;
    int size = 0;

    public void add(T item) {
        Node node = new Node(item);
        if (head == null) head = tail = node;
        else { tail.next = node; node.prev = tail; tail = node; }
        size++;}
    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == size) { add(item); return; }
        Node newNode = new Node(item);
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        newNode.next = current;
        newNode.prev = current.prev;
        if (current.prev != null) current.prev.next = newNode; else head = newNode;
        current.prev = newNode;
        size++;}
    public void set(int index, T item) {
        Node node = getNode(index);
        node.element = item;}
    public void addFirst(T item) { add(0, item); }
    public void addLast(T item) { add(item); }
    public T get(int index) { return getNode(index).element; }
    public T getFirst() { return get(0); }
    public T getLast() { return get(size - 1); }
    public void remove(int index) {
        Node current = getNode(index);
        if (current.prev != null) current.prev.next = current.next; else head = current.next;
        if (current.next != null) current.next.prev = current.prev; else tail = current.prev;
        size--;}
    public void removeFirst() { remove(0); }
    public void removeLast() { remove(size - 1); }
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            Node a = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) a.element).compareTo(a.next.element) > 0) {
                    T tmp = a.element; a.element = a.next.element; a.next.element = tmp; }
                a = a.next; } } }
    public int indexOf(Object obj) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(obj)) return i;
            current = current.next; }
        return -1; }
    public int lastIndexOf(Object obj) {
        Node current = tail;
        for (int i = size - 1; i >= 0; i--) {
            if (current.element.equals(obj)) return i;
            current = current.prev; }
        return -1; }
    public boolean exists(Object obj) { return indexOf(obj) != -1; }
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) { arr[i] = current.element; current = current.next; }
        return arr; }
    public void clear() { head = tail = null; size = 0; }
    public int size() { return size; }
    public boolean isEmpty() {
        return size == 0;
    }
    Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current; }
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            Node current = head;
            public boolean hasNext() { return current != null; }
            public T next() { T temp = current.element; current = current.next; return temp; } }; }
}