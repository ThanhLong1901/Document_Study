
package rectangle.pkgimplements.shape;


public interface Shape {
    public double getArea();
    public double getPerimeter();
    public void setPoint(int x, int y);

    @Override
    public String toString();  
}
