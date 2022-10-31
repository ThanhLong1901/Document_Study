
package rectangle.pkgimplements.shape;


public class RectangleImplementsShape {


    public static void main(String[] args) {

        Rectangle r1= new Rectangle();
        r1.setPoint(4,7);
        r1.getArea();
        r1.getPerimeter();
        System.out.println("Information:\n\t" + r1.toString());  
        

        Circle c1= new Circle();
        c1.setR(7);
        c1.getArea();
        c1.getPerimeter();
        System.out.println("Information:\n\t" + c1.toString());
    }
    }
 
