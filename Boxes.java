public class Boxes {
    private int size;

    public Boxes(int size){
        if(size>10) size=10;
        if(size<1) size=1;
        this.size = size;
    }

    public void setSize(int size){
        if(size>10) size=10;
        if(size<1) size=1;
        this.size = size;
    }

    @Override
    public String toString() {
        return size + " x " + size;
    }

    public void drawBox(){
        String horizontal = "\u2500";
        // top line
        System.out.print("|");
        for(int i=0;i<size;i++) System.out.print(horizontal);
        System.out.println("|");

        // middle lines
        for(int row=0; row < size; row++){
            System.out.print("|");
            for(int col=0; col<size;col++) System.out.print(" ");
            System.out.println("|");
        }

        // bottom line
        System.out.print("|");
        for(int i=0;i<size;i++) System.out.print(horizontal);
        System.out.println("|");
    }
}

