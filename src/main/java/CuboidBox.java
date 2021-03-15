public class CuboidBox {
    private double length;
    private double width;
    private double height;

    public CuboidBox(int l,int w,int h) {
        length = l;
        width = w;
        height = h;
    }

    public double getVolume() {
        //System.out.print("The volume of the box is ");
        //System.out.println(length * width * height + ".");
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
}
