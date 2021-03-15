import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextFloat();
        double width = sc.nextFloat();
        double height = sc.nextFloat();
        ScaleCuboidBox mybox = new ScaleCuboidBox(length,width,height);
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++) {
            int tem = sc.nextInt();
            if (tem == 1) {
                System.out.println(mybox.getLength());
            }
            else if (tem == 2) {
                System.out.println(mybox.getWidth());
            }
            else if (tem == 3) {
                System.out.println(mybox.getHeight());
            }
            else if (tem == 7) {
                System.out.println(mybox.getVolume());
            }
            else {
                double cha = sc.nextFloat();
                if (tem == 4) {
                    mybox.setLength(cha);
                }
                else if (tem == 5) {
                    mybox.setWidth(cha);
                }
                else {
                    mybox.setHeight(cha);
                }
            }
        }
    }
}
