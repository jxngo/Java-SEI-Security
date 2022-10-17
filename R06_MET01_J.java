public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) { 
        assert x != Integer .MIN VALUE;
        assert y != Integer .MIN VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer .MAXVALUE − absY); return absX + absY ;
        }
        //Usage : getAbsAdd( Integer .MIN VALUE, 1);
}
