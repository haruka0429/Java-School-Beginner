package Practice09;
import java.util.Random;

public class Practice09_03 {
    public static void main(String[] args) {

        //10回繰り返したい
        for (int x = 1; x <= 10; x++) {

       //1~6のランダムな変数numを宣言
       Random random = new Random();
       int num = random.nextInt(6) + 1;
       //numが奇数だった場合
            if (num % 2 != 0) {
              System.out.println( x + "回目に" + num + "が出ました");
            }
        }
    
        }
}
