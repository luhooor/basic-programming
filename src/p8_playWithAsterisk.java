public class p8_playWithAsterisk {
    private static void playWithAsterisk(int n) {
//        baris sebanyak n
        for (int i = 1; i <= n; i++) {

//            Spasi (untuk menengahkan)
            for (int j = n; j >= i; j--){
                System.out.print(" ");
            }

//            membuat kolom / banyak bintang
            for (int k = 1; k <= i*2; k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); // untuk line break
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(10);
    }
}
