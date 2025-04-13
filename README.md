# ADS 2nd Assignment

This repository contains implementations of fundamental data structures in Java, developed without using built-in collection classes (except for `Iterator`).

## Implemented Structures

### Physical Data Structures
- `MyArrayList<T>` — dynamic array-based list
- `MyLinkedList<T>` — doubly linked list

Both implement the `MyList<T>` interface with full support for operations such as:
- Adding/removing elements by index
- Adding to front or end
- Getting/setting elements
- Searching (`indexOf`, `lastIndexOf`, `exists`)
- Sorting
- Clearing and converting to array

### Logical Data Structures
- `MyStack<T>` — stack using `MyArrayList`
- `MyQueue<T>` — queue using `MyLinkedList`
- `MyMinHeap<T>` — min-heap using `MyArrayList`

## Usage

To compile and run:

```bash
javac *.java
java Main
