import java.util.Scanner;





class even{
    static int evenum(SLL<Integer> list){
        Node<Integer> temporary=list.getFirst();
        int count=0;
        while(temporary!=null){
            if(temporary.value%2==0){
                count++;
            }
            temporary=temporary.succ;
        }
        return count;
    }
}



public class practice_even{
    public static void main(String[] args){
        SLL<Integer> mylist=new SLL<>();
        System.out.print("How many numbers do you want to add to the list: ");
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        System.out.print("Create the list: ");
        for(int i=0; i<n; i++){
            int numbers=read.nextInt();
            mylist.insertlast(numbers);
        }
        int sonuc =even.evenum(mylist);
        System.out.println("Listedeki cift sayilarin adedi: " + sonuc);
    }
}
