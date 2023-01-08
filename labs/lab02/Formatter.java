public class Formatter {
    public static void writeInColumns(String[] A, int cols) {
        int total = 0;
        for(int i = 0; i < A.length; i++) {
            total += A[i].length();
            if(total +1 < cols) {
                System.out.print(A[i] + " ");
            } else {
                System.out.println();
                total = A[i].length() +1;
                System.out.print(A[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String [] args) {
        String [] times = {"These", "are", "the", "times", "that", "try", "men's", "souls."};
        writeInColumns(times, 20);
    }
}
