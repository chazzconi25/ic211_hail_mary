import java.util.*;
public class Lab03 {
    public static void main(String [] args) {
        Box test = null;
        Scanner in = new Scanner(System.in);
        String cmd = in.next();
        while (!cmd.equals("done")) {
            if(cmd.equals("add")) {
                if(test == null) {
                    test = new Box(Point.read(in));
                } else {
                    test.growBy(Point.read(in));
                }
            } else if(cmd.equals("box")) {
                if(test != null) {
                    System.out.println(test.toString());
                } else {
                    System.out.println("No points added to box yet!");
                }
            } else if(cmd.equals("map")) {
                if(test != null){
                    Point map = test.mapIntoUnitSquare(Point.read(in));
                    if(map == null) {
                        System.out.println("error");
                    } else {
                        System.out.println(map);
                    }
                } else {
                    System.out.println("No points added to box yet!");
                }
            } else {
                System.out.println("Error! Unknown command \"" + cmd + "\"!");
            }
            cmd = in.next();
        }
    }
}
