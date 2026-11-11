class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
}

public class Exercise6 {
    public static void main(String[] args) {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

        /*
        Answers for written part:
        a. Class(static) variable: x
        b. Instance variable: y
        c. Output:
        a.y = 5
        b.y = 6
        a.x = 2
        b.x = 2
        IdentifyMyParts.x = 2
        */
    }
}

