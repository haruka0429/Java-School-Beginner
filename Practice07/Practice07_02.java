package Practice07;
import java.util.Scanner;

public class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Shift-JIS");

        System.out.print("大谷翔平と入力してください > ");
        String name = sc.nextLine().trim();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は" + name + "です");

        sc.close();
    }
    
}
