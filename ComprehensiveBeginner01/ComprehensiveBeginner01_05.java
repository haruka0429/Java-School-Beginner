package ComprehensiveBeginner01;
public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        int i;
        String f = "foo";
        String b = "bar";
        
        for ( i = 1; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(f + b);
           } else if (i % 3 == 0) {
            System.out.println(f);
           } else if (i % 5 == 0) {
            System.out.println(b);
           } else {
            System.out.println(i);
           }
    } 
 }
}
