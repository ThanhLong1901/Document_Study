package Rectangle;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        length = length > 0 ? length : 0;
        width = width > 0 ? width : 0;
    }

    @Override
    public String toString() {
        return "[" + getLength() + "," + getWidth() + "]}";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

}
