public class p2_konversiNilai {
    public static void main(String[] args) {
//        input
        int studentScore = 80;
//        Process: Code

        String nilai;
        if (studentScore <= 100 && studentScore >= 80) {
           nilai = "A";
        } else if (studentScore < 80 && studentScore >= 65) {
            nilai = "B+";
        } else if (studentScore < 65 && studentScore >= 50) {
            nilai = "B";
        } else if (studentScore < 50 && studentScore >= 35) {
            nilai = "C";
        } else if (studentScore < 35 && studentScore >= 0) {
            nilai = "D";
        } else {
            nilai = "Invalid";
        }
//        output
        System.out.println("Nilai "+nilai);
    }
}
