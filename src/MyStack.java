public class MyStack<T extends Comparable<T>> {
    MyArrayList<T> list = new MyArrayList<>();

    public void push(T value) { list.add(value); }

    public T pop() {
        T val = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return val;
    }

    public T peek() { return list.get(list.size() - 1); }

    public boolean isEmpty() { return list.isEmpty(); }
}