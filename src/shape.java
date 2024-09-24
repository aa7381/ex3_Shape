public class shape {
    double a, b, c;
    double R;
    double height;

    public shape(double a, double b, double c, double R, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.R = R;
        this.height = height;
    }

    public shape() {
        a = 0;
        b = 0;
        R = 0;
        height = 0;
    }

    public void calculateArea() {
        System.out.println("Calculte area to shape ");
    }

    public void calculatePerimeter() {
        System.out.println("Calculate perimeter to shape  ");

    }
}