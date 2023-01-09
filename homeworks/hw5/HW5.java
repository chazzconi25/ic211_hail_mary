public class HW5 {
    public static void main(String [] args) {
        Countdown bottles = new Countdown(99, 1);
        String curr = bottles.next();
        while(!bottles.done()) {
            System.out.println(sentenceBegin(curr) + " bottles of beer on the wall, " + curr + " bottles of beer.");
            curr = bottles.next();
            System.out.println("Take one down and pass it around, " + curr + " bottles of beer on the wall.");
            System.out.println();
        }
        System.out.println(sentenceBegin(curr) + " bottle of beer on the wall, " + curr + " bottle of beer.");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
    }

    public static String sentenceBegin(String word) {
        String letter =  word.substring(0,1).toUpperCase();
        String rest = word.substring(1);
        return letter + rest;
    }
}
