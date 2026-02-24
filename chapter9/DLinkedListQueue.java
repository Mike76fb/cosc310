package chapter9;

import my.util.DLinkedList;

public class DLinkedListQueue<T> implements Queue<T> {

    private final DLinkedList<T> list;

    public DLinkedListQueue() {
        list = new DLinkedList<>();
    }

    @Override
    public void enqueue(T item) {
        list.add(item); // add to tail (FIFO)
    }

    @Override
    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.removeFirst().getData(); // remove from head
    }

    @Override
    public T front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.get(0).getData(); // peek at head
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
        
    }
}
