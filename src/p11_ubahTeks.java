public class p11_ubahTeks {
    private static String ubahHuruf(String s) {
        String[] abjad = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W","X","Y","Z", " "};
        String hasilKata = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String huruf = String.valueOf(c);

            for (int j = 0; j < abjad.length; j++) {
                if (huruf.equalsIgnoreCase(abjad[j])) { // if ini digunakan untuk mengetahui posisi huruf di value S terhadap abjad
                    int ganti = j+10;
                    if (j == 26) { //if ini digunakan untuk kasus spasi
                        ganti = 26;
                        hasilKata += abjad[ganti];
                    } else if(j > 16) { //jika n+10 = lebih dari 26 maka dikembalikan ke awal
                        ganti -= 26;
                        hasilKata += abjad[ganti];
                    } else { // kasus biasa
                        hasilKata += abjad[ganti];
                    }
                }
            }

        }
        return hasilKata;
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
        System.out.println(ubahHuruf("YANUAR LUHUR KURNIAWAN"));


    }
}
