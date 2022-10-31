package Rectangle;

public class Box extends Rectangle {

    private int height = 0;

    public Box() {
        super();
    }

    public Box(int length, int weight, int height) {
        super(length, weight);
        height = height > 0 ? height : 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + getLength() + "," + getWidth() + "," + getHeight() + "]";
    }

    public int area() {
        return 2 * (getLength() + getWidth()) * height + 2 * super.area();
    }

    public int volumn() {
        return super.area() * height;
    }

}
