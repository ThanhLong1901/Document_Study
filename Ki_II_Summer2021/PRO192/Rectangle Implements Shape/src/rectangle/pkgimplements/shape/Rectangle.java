
package rectangle.pkgimplements.shape;


public class Rectangle implements Shape{
    Point startingOne;
    int length;
    int width;

    
    public Rectangle() {
    }
    
    
    @Override
    public void setPoint(int x, int y){
        Point p1 = new Point(x, y);
    }
    
    public Rectangle(Point point, int length, int width) {
        //Gan point vao startingOne
        startingOne = point;
        
//        startingOne = new Point(point.getX(), point.getY());
        
        this.length = length;
        this.width = width; 
    }
    
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) / 2;
    }

    @Override
    public String toString() {
        return "(" + "," + width + "," + length + ",";
    }
    
}
