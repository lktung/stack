package implement;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements MyStackInterface<T> {

    private List<T> list = new ArrayList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void makeEmpty() {
        list = new ArrayList<>();
    }

    @Override
    public void pop() {
        try {
            if (list.size() <= 0) {
                throw new Exception();
            }
            list.remove(list.size() - 1);
        } catch (Exception e) {
            System.out.println("Stack is Empty");
        }
    }

    @Override
    public void push(T value) {
        try {
            if(list.size() >= Integer.MAX_VALUE){
                throw new Exception();
            }
            list.add(value);
        }catch (Exception e){
            System.out.println("Stack is max size");
        }

    }

    @Override
    public T top() {
        try{
            if(list.size() <=0){
                throw new Exception();
            }
        return list.get(list.size() - 1);
        }catch (Exception e) {
            System.out.println("Stack is Empty!!!!");
            return null;
        }
    }

    @Override
    public int length() {
        return list.size();
    }
}
