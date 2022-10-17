public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MINVALUE || y == Integer.MINVALUE) {
            throw new IllegalArgumentException ();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX>Integer.MAXVALUE−absY){
            throw new IllegalArgumentException ();
        }
        return absX + absY ;
    }
}
