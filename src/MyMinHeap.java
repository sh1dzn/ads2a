public class MyMinHeap<T extends Comparable<T>> {
    MyArrayList<T> heap = new MyArrayList<>();
    public void insert(T value) { heap.add(value); heapifyUp(heap.size() - 1); }
    public T extractMin() { if (heap.isEmpty()) return null; T min = heap.get(0); heap.data[0] = heap.get(heap.size() - 1); heap.remove(heap.size() - 1); heapifyDown(0); return min; }
    void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) < 0) swap(index, parent);
            else break;
            index = parent; } }
    void heapifyDown(int index) {
        int left = 2 * index + 1, right = 2 * index + 2, smallest = index;
        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) smallest = left;
        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) smallest = right;
        if (smallest != index) { swap(index, smallest); heapifyDown(smallest); } }
    void swap(int i, int j) { T tmp = heap.get(i); heap.data[i] = heap.get(j); heap.data[j] = tmp; }
}