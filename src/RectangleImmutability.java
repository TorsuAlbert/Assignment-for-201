import java.awt.*;

public class RectangleImmutability {
    public double length;
    public double width;


    public RectangleImmutability(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    static void main(String[] args) {
        RectangleImmutability r1 = new RectangleImmutability(7.00,5.00);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
