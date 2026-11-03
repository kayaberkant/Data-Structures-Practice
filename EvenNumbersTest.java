import java.util.Scanner;

public class EvenNumbersTest {

    public static int evennum(SLL<Integer> list) {
        Node<Integer> temporary = list.getFirst();
        int count = 0;
        while (temporary != null) {
            if (temporary.value % 2 == 0) {
                count++;
            }
            temporary = temporary.succ;
        }
        return count;
    }

    public static void main(String[] args) {
        SLL<Integer> mylist = new SLL<>();
        Scanner read = new Scanner(System.in);

        System.out.print("Listeye kac eleman eklemek istiyorsunuz? ");
        int n = read.nextInt();

        System.out.println(n + " adet sayiyi giriniz:");
        for (int i = 0; i < n; i++) {
            int numbers = read.nextInt();
            mylist.insertlast(numbers);
        }

        System.out.println("\nOlusturdugunuz Liste:");
        mylist.printlist();

        int sonuc = evennum(mylist);
        System.out.println("Listedeki cift sayilarin adedini: " + sonuc);

        read.close();
    }
}