public class MyQueue<T> {
    MyLinkedList<T> list = new MyLinkedList<>();
    public void enqueue(T value) { list.add(value); }
    public T dequeue() { T val = list.get(0); list.remove(0); return val; }
    public T peek() { return list.get(0); }
    public boolean isEmpty() { return list.isEmpty(); }
}