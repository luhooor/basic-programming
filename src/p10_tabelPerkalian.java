public class p10_tabelPerkalian {
    private static void cetakPerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetakPerkalian(10);
    }
}
