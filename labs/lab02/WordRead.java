import java.util.*;
import java.io.*;
public class WordRead {
    public static String[] get(String fname) {
        StringNode list = null;
        Scanner in = null;
        try { in = new Scanner(new FileReader(fname)); } 
        catch(IOException e) { e.printStackTrace(); System.exit(1); }
        while(in.hasNext()) {
            list = ListStuff.addToFront(in.next(), list);
        }
        return ListStuff.listToArray(list);
    }
    public static void main(String [] args) {
        String [] A = get("nouns.txt");
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}