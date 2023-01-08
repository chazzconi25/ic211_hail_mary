public class ListStuff {
    public static StringNode addToFront(String s, StringNode Nold) {
        StringNode Nnew = new StringNode();
        Nnew.data = s;
        Nnew.next = Nold;
        return Nnew;
    }
    public static int listLen(StringNode N) {
        if(N == null) {
            return 0;
        }
        return 1 + listLen(N.next);
    }

    public static String[] listToArray(StringNode N) {
        String [] list = new String[listLen(N)];
        for(int i = 0; i < list.length; i++) {
            list[i] = N.data;
            N = N.next;
        }
        return list;
    }
    public static void main(String [] args) {
        StringNode N = null;      // at this point N *is* an empty list
        N = addToFront("rat",N);  // at this point N *is* the list ("rat")
        N = addToFront("dog",N);  // at this point N *is* the list ("dog","rat")
        N = addToFront("pig",N);  // at this point N *is* the list ("pig","dog","rat")
        String[] A = listToArray(N);
        for(int i = 0; i < A.length; i++)
            System.out.println(A[i]);
    }
}