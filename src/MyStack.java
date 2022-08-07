import java.util.Arrays;

public class MyStack<E>{
    private static final int INITIAL_SIZE = 0;
    private E[] elements;
    private int count = 0;
    public MyStack() {
        elements = (E[]) new Object[INITIAL_SIZE];
    }
    public void push(E e){
        ensureCapacity();
        elements[count++] = e;
    }
    private void ensureCapacity() {
        System.out.println("length"+elements.length);
        System.out.println("count"+count);
        if(count >= elements.length){
            E[] newElements = (E[]) new Object[elements.length+1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;
        }
    }
    public void pop(){
        if(count == 0){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        count--;
        E[] newElements = (E[]) new Object[elements.length-1];
        System.arraycopy(elements, 0, newElements, 0,count);
        elements = newElements;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "elements=" + Arrays.toString(elements) +
                ", count=" + count +
                '}';
    }
}

