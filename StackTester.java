import java.util.Scanner;

public class StackTester {
    public static void main(String[] args){
        System.out.print("Give me a word ım gonna reverse it: ");
        Scanner input=new Scanner(System.in);
        String word=input.next();
        ArrayStack<Character> myarray=new ArrayStack<>(word.length());
        for(int i=0; i<word.length(); i++){
            char harf=word.charAt(i);
            myarray.push(harf);
        }
        System.out.print("Reverse version: ");
        while(!myarray.isEmpty()){
            System.out.print(myarray.pop());
        }

    }
}
