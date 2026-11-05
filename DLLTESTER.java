import java.util.Scanner;

public class DLLTESTER {
    public static void main(String[] args){
        DLL<Integer> mylist=new DLL<>();
        System.out.println("how many numbers do you wanna ad your DLL: ");
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        System.out.println("insert numbers: ");
        for(int i=0; i<n; i++){
         int numbers=read.nextInt();
         mylist.prepend(numbers);
        }
        System.out.println("Your list: ");
        mylist.printlist();
        System.out.println("Add one more element: ");
        int newnum=read.nextInt();
        System.out.println("After which element do you want to add it?: ");
        int place=read.nextInt();
        mylist.insertafter(newnum,place);
        mylist.printlist();
        System.out.println("Add one more element: ");
        int othernum=read.nextInt();
        System.out.println("Before which element do you want to add it?: ");
        int otherplace=read.nextInt();
        mylist.insertbefore(othernum,otherplace);
        mylist.printlist();

    }
}
