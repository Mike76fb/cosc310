package chapter9;

public interface PriorityQueue<T> {
    public void enqueue(int priority, T data);
    public T dequeue() throws Exception;
    public T front() throws Exception;
    public int size();
    public boolean isEmpty();
    
}
