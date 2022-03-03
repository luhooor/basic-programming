public class p3_faktorBilangan {
    public static void main(String[] args) {
        int bilangan = 20;

//     Process
        for (int i = 1; i <= bilangan; i++) {
            if(bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
