public class Time {
    int hh, mm, ss;
    public boolean equal(Time t) {return this.hh == t.hh && this.mm == t.mm && this.ss == t.ss;}
    public static boolean equal(Time t1, Time t2) {return t1.hh == t2.hh && t1.mm == t2.mm && t1.ss == t2.ss;}
}
