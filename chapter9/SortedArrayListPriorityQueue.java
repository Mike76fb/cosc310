package chapter9;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SortedArrayListPriorityQueue<T> implements PriorityQueue<T> {

    private static class Entry<T> implements Comparable<Entry<T>> {
        final int priority;
        final T data;

        Entry(int priority, T data) {
            this.priority = priority;
            this.data = data;
        }

        @Override
        public int compareTo(Entry<T> o) {
            return this.priority - o.priority;
        }
    }

    private final ArrayList<Entry<T>> list;

    public SortedArrayListPriorityQueue() {
        list = new ArrayList<>();
    }

    @Override
    public void enqueue(int priority, T data) {
        // insert so list is sorted by priority ASC (lower number = higher priority)
        list.add(new Entry<>(priority, data));
        list.sort(null);  // sorts by Entry.compareTo()
    }

    @Override
    public T dequeue() throws Exception {
        if (isEmpty()) {                         
            throw new NoSuchElementException();  
        }
        return list.remove(0).data;
    }

    @Override
    public T front() throws Exception {
        if (isEmpty()) {                         
            throw new NoSuchElementException();  
        }
        return list.get(0).data;
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
