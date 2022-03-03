public class p6_palindrome {

    private static boolean palindrome(String value) {
        String kataBalik = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);
            kataBalik += String.valueOf(c);
        }

        return value.equals(kataBalik);

//        return value.equals(kataBalik);
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}