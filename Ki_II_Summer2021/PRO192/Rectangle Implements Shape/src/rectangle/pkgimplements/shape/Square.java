 
package rectangle.pkgimplements.shape;


public class Square implements Shape{
    private int length;
    private int width;

    public Square() {
    }

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setPoint(int x, int y) {
        length = x;
        width = y;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Area is:\t" + getArea() + "\n" + "\tPerimeter is:\t" + getPerimeter();
    }

}
