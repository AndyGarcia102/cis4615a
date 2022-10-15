public static int getAbsAdd ( int x , int y ) {
    assert x != Integer.MINVALUE;
    assert y != Integer.MINVALUE;
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    assert(absX <= Integer.MAXVALUE - absY);
    return absX + absY;
}
//Usage: getAbsAdd(Integer.MINVALUE,1);
//Correct the code as shown in the Compliant Solution below:

public static int getAbsAdd (int x ,int y){
    if(x == Integer.MINVALUE || y == Integer.MINVALUE){
        thrownewIllegalArgumentException();
    }
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    if(absX > Integer.MAXVALUE - absY){
        throw new IllegalArgumentException();
    }
    return  absX + absY;
}