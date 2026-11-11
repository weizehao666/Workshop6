public class Driver {
    public static void main(String[] args) {
        Boxes b1 = new Boxes(3);
        System.out.println("Box size: "+b1);
        b1.drawBox();

        Boxes b2 = new Boxes(5);
        System.out.println("\nBox size: "+b2);
        b2.drawBox();

        b2.setSize(10);
        System.out.println("\nResized box: "+b2);
        b2.drawBox();
    }
}

