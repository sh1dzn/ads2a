public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Test add and size
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add: " + java.util.Arrays.toString(list.toArray()));

        // Test add at index
        list.add(1, 15);
        System.out.println("After add at index 1: " + java.util.Arrays.toString(list.toArray()));

        // Test addFirst and addLast
        list.addFirst(5);
        list.addLast(40);
        System.out.println("After addFirst and addLast: " + java.util.Arrays.toString(list.toArray()));

        // Test get, getFirst, getLast
        System.out.println("Get index 2: " + list.get(2));
        System.out.println("Get first: " + list.getFirst());
        System.out.println("Get last: " + list.getLast());

        // Test set
        list.set(2, 17);
        System.out.println("After set index 2 to 17: " + java.util.Arrays.toString(list.toArray()));

        // Test remove
        list.remove(3);
        System.out.println("After remove index 3: " + java.util.Arrays.toString(list.toArray()));

        // Test removeFirst and removeLast
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + java.util.Arrays.toString(list.toArray()));

        // Test indexOf, lastIndexOf, exists
        System.out.println("Index of 17: " + list.indexOf(17));
        System.out.println("Last index of 30: " + list.lastIndexOf(30));
        System.out.println("Exists 20? " + list.exists(20));

        // Test sort
        list.sort();
        System.out.println("After sort: " + java.util.Arrays.toString(list.toArray()));

        // Test clear and isEmpty
        list.clear();
        System.out.println("After clear, is empty? " + list.isEmpty());
    }
}
