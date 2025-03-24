package ComprehensiveBeginner01;
import java.util.Random;

public class ComprehensiveBiginner01_02 {
    public static void main(String[] args) {
        //配列を宣言
        int[] arr;
        arr = new int[100];

        int sum = 0;
        
        //繰り返して代入
        for (int i = 1; i < arr.length; i++) {
            //ランダムな変数numを宣言
            Random random = new Random();
            int num = random.nextInt(100) + 1;
             //出力する
            System.out.println("ランダム変数" + num);

            sum += num;
            //合計を出力する
            System.out.println("合計" + sum);
            //if 合計が100を超えた場合もしくは代入が10回行われた場合終了
            if (sum > 100 || i == 10) {
                break; //繰り返し終了
            }
            System.out.println("代入" + i + "回目");

        }
       
    }
    
}
