package Practice07;
import java.util.Scanner;

public class Practice07_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("自然数を入力してください　＞");
        int number = scan.nextInt();

        System.out.println( number + " を 3で 割ったあまりは" + number % 3 + "です");

        scan.close();
    }
    
}
