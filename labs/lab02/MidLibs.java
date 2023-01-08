public class MidLibs {
    public static void main(String [] args) {
        if(args.length == 0) {
            System.out.println("usage: java MidLibs <filename>");
        } else {
            String [] words = WordRead.get(args[0]);
            Formatter.writeInColumns(words, 35);
        }
    }
}
