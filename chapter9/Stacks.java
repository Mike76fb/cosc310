package chapter9;

public interface Stacks<T> {

    public void push(T data);
    public T pop() throws Exception;
    public T top() throws Exception;
    public int size();
    public boolean isEmpty();

}
