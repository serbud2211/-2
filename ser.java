public class ser {
    public static void main(String[] args) {

        int a = 600;
        int b = 4;
        int c = 6;
        int v = Math.max(b,c);
        int max2 = a / v;
        int max1 = (a - (max2 * v));
        System.out.println( max1);
        System.out.println( max2);
        System.out.println( "Hello");
        System.out.println( max1 - b);
    }
}