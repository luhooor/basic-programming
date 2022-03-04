public class p9_drawXYZ {

    private static void DrawXYZ(int n) {
        int awal = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (awal % 3 == 0) {
                    System.out.print("X ");
                } else if (awal % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
                awal++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawXYZ(5);
        System.out.println("---------");
        DrawXYZ(3);
        System.out.println("---------");
        DrawXYZ(1);
    }
}
