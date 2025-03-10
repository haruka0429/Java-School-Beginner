package Practice08;

import java.util.Random;

public class Practice08_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int age = rand.nextInt(21);

        Random rd = new Random();
        int gender = rd.nextInt(2);

        if (age <= 3 && gender == 0){
            System.out.println("あなたはbabyな男です");
        } else if (age <= 3 && gender == 1) {
            System.out.println("あなたはbabyな女です");
        } else if ((3 < age && age < 6) && (gender == 0)) {
            System.out.println("あなたはchildな男です");
        } else if ((3 < age && age < 6) && (gender == 1)) {
            System.out.println("あなたはchildな女です");
        } else if ((6 <= age && age < 18) && (gender == 0)) {
            System.out.println("あなたはkidな男です");
        } else if ((6 <= age && age < 18) && (gender == 1)) {
            System.out.println("あなたはkidな女です");
        } else if ((18 <= age) && (gender == 0)) {
            System.out.println("あなたはadultな男です");
        } else if ((18 <= age) && (gender == 1)) {
            System.out.println("あなたはadultな女です");
        }
        }
}
