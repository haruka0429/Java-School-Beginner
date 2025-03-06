package Practice06s;
public class Practice06_03s {
    public static void main(String[] args) {
        int a = 3;
        String name01 = "a は 2ではない かつ 3未満 の結果は";
        boolean c;

        c = (a != 2 && a < 3);

        System.out.println(name01 + c + "です");

        int b = 5;
        String name02 = "b は 1である または5以上 の結果は";
        boolean d;

        d = (b == 1 || b >=5);

        System.out.println(name02 + d + "です");
    }
    
}
