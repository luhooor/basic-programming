public class p12_mean {
    private static float Mean(float[] numbers) {
        float hasil = 0, jumlah = 0;

        for (int i = 0; i < numbers.length; i++) {
            jumlah += numbers[i];
            hasil = jumlah/numbers.length;
        }
        return hasil;
    }

    public static void main(String[] args) {
       float[] value = {1,2,3,4};

       System.out.println(Mean(value));
    }
}
