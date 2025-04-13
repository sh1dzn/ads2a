public class Main {
    public static void main(String[] args) {
        // Working with MyArrayList
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);                  // adding element at the end
        arrayList.add(20);
        arrayList.add(30);
        arrayList.addFirst(5);              // adding element at the beginning
        arrayList.addLast(40);              // explicitly adding to the end
        arrayList.set(2, 15);               // replacing 20 with 15
        arrayList.remove(3);                // removing 30 (which was at index 3)
        arrayList.sort();                   // sorting the array in ascending order
        System.out.println("ArrayList:");
        for (int val : arrayList) System.out.print(val + " ");  // printing elements
        System.out.println();

        // Testing MyLinkedList functionality
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("b");
        linkedList.add("c");
        linkedList.addFirst("a");           // inserting at the start
        linkedList.addLast("d");            // inserting at the end
        linkedList.removeFirst();           // removing "a"
        linkedList.removeLast();            // removing "d"
        System.out.println("\nLinkedList:");
        for (String val : linkedList) System.out.print(val + " ");
        System.out.println();

        // Checking MyStack behavior
        MyStack<String> stack = new MyStack<>();
        stack.push("apple");                // push apple to stack
        stack.push("banana");
        stack.push("cherry");               // cherry is now at the top
        System.out.println("\nStack peek: " + stack.peek());      // should be cherry
        System.out.println("Stack pop: " + stack.pop());           // removing cherry
        System.out.println("Stack pop again: " + stack.pop());     // removing banana

        // Trying MyQueue operations
        MyQueue<Double> queue = new MyQueue<>();
        queue.enqueue(1.1);
        queue.enqueue(2.2);
        queue.enqueue(3.3);
        System.out.println("\nQueue peek: " + queue.peek());       // first element
        System.out.println("Queue dequeue: " + queue.dequeue());    // removes 1.1
        System.out.println("Queue dequeue again: " + queue.dequeue()); // removes 2.2

        // Testing MyMinHeap with integers
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(25);
        heap.insert(10);
        heap.insert(5);
        heap.insert(40);
        System.out.println("\nMinHeap extractMin: " + heap.extractMin());   // should be 5
        System.out.println("MinHeap extractMin again: " + heap.extractMin()); // should be 10
    }
}
