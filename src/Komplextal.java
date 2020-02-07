import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.bind.WhiteSpaceProcessor;

public class Komplex {
    double re;
    double im;

    public Komplex(double r, double i) {
        this.re = r;
        this.im = i;
    }
    public static void main (String[] args) {

        Komplex a = new Komplex(6,8);
        Komplex b = new Komplex(5, 2);
        Komplex c = a.add(b);
        Komplex d = a. multiplay(b);
    }


    }

    private Komplex add(Komplex b) {
        return new Komplex(this.re+b.re, this.im+b.im);

        private Komplex multiplay(Komplex b) {
            return Komplex( re this.re-b.re, im this im*b.im );

            //a.add(b)= ( Komplex a add Komplex b + im);


    }
}



