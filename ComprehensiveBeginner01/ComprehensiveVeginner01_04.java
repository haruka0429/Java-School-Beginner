package ComprehensiveBeginner01;
import java.util.Scanner;

public class ComprehensiveVeginner01_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("何段＞");
        int inputNum = scan.nextInt();

       if (inputNum > 5) {
        System.out.println("1～5までの数字を入力してください");
        System.exit(0);
       }

        //System.out.println("入力された値は" + inputNum);

        for (int x = 1; x <= inputNum; x++) {
            for(int y = 1; y < x + 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        scan.close();
        }

    
}
