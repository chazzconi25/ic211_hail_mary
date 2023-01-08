public class Formatter {
    public static void writeInColumns(String[] A, int cols) {
        int total = 0;
        for(int i = 0; i < A.length; i++) {
            if((total + A[i].length()) > cols) {
                total = 0;
                System.out.println();
            }
            total += A[i].length() +1;
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args) {
        String [] times = {"These", "are", "the", "times", "that", "try", "men's", "souls."};
        writeInColumns(times, 10);
    }
}
