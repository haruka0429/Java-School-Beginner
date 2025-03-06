package Practice07;
import java.util.Scanner;

public class Practice07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("少数を入力してください > ");
        float inputNum = sc.nextFloat();

        System.out.println("入力された値は" + inputNum + "です");

        sc.close();
    }
    
}
