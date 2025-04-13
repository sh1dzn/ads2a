public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    Object[] data;
    int size;
    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }


    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }
    public void add(int index, T item) {
        checkIndex(index);
        ensureCapacity();
        for (int i = size; i > index; i--) data[i] = data[i - 1];
        data[index] = item;
        size++;
    }
    public void set(int index, T item) {
        checkIndex(index);
        data[index] = item;
    }
    public void addFirst(T item) {
        add(0, item);
    }
    public void addLast(T item) {
        add(item);
    }
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }
    public T getFirst() {
        return get(0);
    }
    public T getLast() {
        return get(size - 1);
    }
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) data[i] = data[i + 1];
        data[--size] = null;
    }
    public void removeFirst() {
        remove(0);
    }
    public void removeLast() {
        remove(size - 1);
    }
    public void sort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (((T) data[j]).compareTo((T) data[j + 1]) > 0) {
                    T temp = (T) data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
    }
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) if (data[i].equals(object)) return i;
        return -1;
    }
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) if (data[i].equals(object)) return i;
        return -1;
    }
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }
    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) result[i] = data[i];
        return result;
    }
    public void clear() {
        for (int i = 0; i < size; i++) data[i] = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) newData[i] = data[i];
            data = newData;
        }
    }
    void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int i = 0;
            public boolean hasNext() { return i < size; }
            public T next() { return (T) data[i++]; }
        };
    }
}
