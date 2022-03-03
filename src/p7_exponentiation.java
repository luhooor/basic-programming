public class p7_exponentiation {

    public static void main(String[] args) {
        int bilangan = 2;
        int pangkat = 3;
        int hasil = 1;

        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
        }

        System.out.println(hasil);

    }

}
