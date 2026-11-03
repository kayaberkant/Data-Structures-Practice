class Node<E> {
    E value;
    Node<E> succ;

    Node(E value, Node<E> succ) {
        this.value = value;
        this.succ = succ;
    }
}