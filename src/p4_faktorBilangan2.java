public class p4_faktorBilangan2 {
    public static void main(String[] args) {
        int bilangan = 20;
//        process
        for (int i = bilangan; i >= 1; i--) {
            if(bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
