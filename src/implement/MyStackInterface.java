package implement;

public interface MyStackInterface<T> {
    public boolean isEmpty();
    public void makeEmpty();
    public void pop();
    public void push(T value);
    public T top();
    public int length();
}
