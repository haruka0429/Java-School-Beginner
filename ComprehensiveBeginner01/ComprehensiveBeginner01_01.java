package ComprehensiveBeginner01;
import java.util.Scanner;

public class ComprehensiveBeginner01_01 {

    public static void main(String[] args) {
        System.out.println("1を入力してください");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];

        array[0] = scan.nextInt();
        int a = array[0];
        System.out.println("1番目の要素は" + a + "で、" + 
        "2倍にすると" + (a * 2) + "になり、3で割ったあまりは" + (a % 3) + "です");

        System.out.println("50を入力してください");
        array[1] = scan.nextInt();
        int b = array[1];
        System.out.println("2番目の要素は" + b + "で、" + 
        "2倍にすると" + (b * 2) + "になり、3で割ったあまりは" + (b % 3) + "です");

        System.out.println("10を入力してください");
        array[2] = scan.nextInt();
        int c = array[2];
        System.out.println("3番目の要素は" + c + "で、" + 
        "2倍にすると" + (c * 2) + "になり、3で割ったあまりは" + (c % 3) + "です");


        scan.close();

    }
}