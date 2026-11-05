public class DLL<E> {
    DLLNODE<E> first;
    DLLNODE<E> last;
    DLL(){
        this.first = null;
        this.last = null;
    }
    void prepend(E value){
        DLLNODE<E> newnode=new DLLNODE<>(value,null,first);
        if(first==null){
            first=newnode;
            last = newnode;
        }else{
            first.pred=newnode;
            first=newnode;
        }
    }
    void insertlast(E value){
        DLLNODE<E> othernode=new DLLNODE<>(value,last,null);
        if(first==null){
            first = othernode;
            last=othernode;
        }else{
            last.succ=othernode;
            last=othernode;
        }
    }
    void printlist(){
        if(first==null){
            System.out.println("empty list");
        }else{
            DLLNODE<E> tmp=first;
            while(tmp!=null){
                System.out.print(tmp.value + " <-> ");
                tmp = tmp.succ;
            }
            System.out.println("null");
        }
    }
    public void insertafter(E value, E target){
        DLLNODE<E> current = first;
        while (current != null && !current.value.equals(target)) {
            current = current.succ;
        }

        if (current == null) {
            System.out.println("Target value (" + target + ") couldn't find in the list!");
            return;
        }

        DLLNODE<E> newNode = new DLLNODE<>(value, current, current.succ);

        if (current.succ != null) {
            current.succ.pred = newNode;
        }
        current.succ = newNode;
    }

    void insertbefore(E value,E target){
        DLLNODE<E> current = first;
        while (current != null && !current.value.equals(target)) {
            current = current.succ;
        }

        if (current == null) {
            System.out.println("Aranan değer (" + target + ") listede bulunamadı!");
            return;
        }
        if(current==first){
            prepend(value);
            return;
        }
        DLLNODE<E> ins=new DLLNODE<>(value,current.pred,current);
        // Soldaki komşunun sağ bağını yeni düğüme çevir
        current.pred.succ = ins;
        // Bulduğumuz düğümün sol bağını yeni düğüme çevir
        current.pred = ins;
    }
}
