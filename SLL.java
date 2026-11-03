class SLL<E> {
    Node<E> head;

    SLL() {
        this.head = null;
    }

    void insertlast(E value) {
        Node<E> ins = new Node<>(value, null);
        if (head == null) {
            head = ins;
        } else {
            Node<E> tmp = head;
            while (tmp.succ != null) {
                tmp = tmp.succ;
            }
            tmp.succ = ins;
        }
    }
    void prepend(E value){
        Node<E> ins=new Node<>(value,head);
        head=ins;
    }

    public Node<E> getFirst() {
        return head;
    }

    void printlist() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.succ;
        }
        System.out.println("null");
    }
}
