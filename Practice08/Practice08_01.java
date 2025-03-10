package Practice08;
import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int gender = rand.nextInt(2);

        if (gender == 0) {
            System.out.println("あなたは男です");
        } else {
            System.out.println("あなたは女です");
        }


    }
    
}
