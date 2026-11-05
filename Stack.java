public interface Stack<E> {

    boolean isEmpty();

    E peek();

    void clear();


    void push(E x);

    E pop();
}
