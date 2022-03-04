public class p5_bilanganPrima {

    private static boolean primeNumber(int number) {
        int pembagi = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                pembagi++;
            }
        }
        return pembagi == 2;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
