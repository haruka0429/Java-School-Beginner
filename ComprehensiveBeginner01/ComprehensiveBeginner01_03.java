package ComprehensiveBeginner01;
import java.util.Random;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        //1～3のランダムな整数
        Random random = new Random();

        int man = random.nextInt(3) + 1;
        int woman = random.nextInt(3) + 1;
        int child = random.nextInt(3) + 1;

        System.out.println(man);
        System.out.println(woman);
        System.out.println(child);

        if (man == 1) {
            if ((woman == 1 && child == 1) || (woman == 2 && child == 3) || (woman == 3 && child == 2)) {
                System.out.println("あいこです");
            } else if (woman == 3 && child == 3) {
                System.out.println("manが勝ちました");
            } else if (woman == 2 && child == 1) {
                System.out.println("womanが勝ちました");
            } else if (woman == 1 && child == 2) {
                System.out.println("childが勝ちました");
            } else if (woman == 1 && child == 3) {
                System.out.println("manとwomanが勝ちました");
            } else if (woman == 2 && child == 2) {
                System.out.println("womanとchildが勝ちました");
            } else if (woman == 3 && child == 1) {
                System.out.println("manとchildが勝ちました");
            }
        } else if (man == 2) {
            if ((woman == 1 && child == 3) || (woman == 2 && child == 2) || (woman == 3 && child == 1)) {
                    System.out.println("あいこです");
            } else if (woman == 1 && child == 1) {
                System.out.println("manが勝ちました");
            } else if (woman == 3 && child == 2) {
                System.out.println("womanが勝ちました");
            } else if (woman == 2 && child == 3) {
                System.out.println("childが勝ちました");
            } else if (woman == 2 && child == 1) {
                System.out.println("manとwomanが勝ちました");
            } else if (woman == 3 && child == 3) {
                System.out.println("womanとchildが勝ちました");
            } else if (woman == 1 && child == 2) {
                System.out.println("manとchildが勝ちました");
            }
        } else if (man == 3) {
            if ((woman == 3 && child == 3) || (woman == 1 && child == 2) || (woman == 2 && child == 1)) {
                    System.out.println("あいこです");
            } else if (woman == 2 && child == 2) {
                System.out.println("manが勝ちました");
            } else if (woman == 1 && child == 3) {
                System.out.println("womanが勝ちました");
            } else if (woman == 3 && child == 1) {
                System.out.println("childが勝ちました");
            } else if (woman == 3 && child == 2) {
                System.out.println("manとwomanが勝ちました");
            } else if (woman == 1 && child == 1) {
                System.out.println("womanとchildが勝ちました");
            } else if (woman == 2 && child == 3) {
                System.out.println("manとchildが勝ちました");
            }
        }
    }
} 
      
    

