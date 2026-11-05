public class DLLNODE<E> {
    E value;
    DLLNODE<E> pred;
    DLLNODE<E> succ;
    DLLNODE(E value,DLLNODE<E> pred,DLLNODE<E> succ){
        this.value=value;
        this.pred=pred;
        this.succ=succ;
    }
}
