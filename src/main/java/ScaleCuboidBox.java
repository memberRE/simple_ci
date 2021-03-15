public class ScaleCuboidBox {
    private double length;
    private double width;
    private double height;

    public ScaleCuboidBox(double l,double w,double h) {
        length = l;
        width = w;
        height = h;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double x) {
        length = x;
    }

    public void setHeight(double x) {
        height = x;
    }

    public void setWidth(double x) {
        width = x;
    }
}
