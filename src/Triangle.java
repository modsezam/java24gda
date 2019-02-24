public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isRectangular(){

        if ( c == Math.sqrt(a*a + b*b) ){
            return true;
        }
        else
            return false;

    }
}
