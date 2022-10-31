
package rectangle.pkgimplements.shape;


public class Circle implements Shape{
    private static final double PI = 3.14;
    private int r;

    public Circle() {
    }

    @Override
    public void setPoint(int x, int y) {
        
    }
    
    public void setR(int r) {
        this.r = r;
    }
    
    public Circle(int r) {
        this.r = r;
    }
    @Override
    public double getArea(){
        return PI*(r^2);
    }
    @Override
    public double getPerimeter(){
        return 2*PI*r;
    }
    @Override
    public String toString(){
        return "Area is:\t" + getArea() + "\n" + "\tPerimeter is:\t" + getPerimeter();
    }
}
