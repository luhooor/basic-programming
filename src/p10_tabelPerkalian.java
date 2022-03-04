public class p10_tabelPerkalian {
    private static void cetakPerkalian(int n) {

        if (n > 30 || n < 1) {
            System.out.println("Mohon masukkan angka dari 1 - 30");
        } else {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        cetakPerkalian(9);
    }
}
