import com.sun.org.apache.regexp.internal.RE;

public class Komplex {
    double re;
    double im;

    public Komplex(double r, double i) {
        this.re = r;
        this.im = i:
    }
    public static void main (String[] args) {

        Komplex a = new Komplex(6,8);
        Komplex b = new Komplex(5, 2);
        Komplex c = a.add(b);
        Komplex d = a.multiply(b);

    }
}



