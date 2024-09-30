package Question1;

public class testMyLine {
    public static void main(String[] args) {
        myLine line = new myLine(1, 2, 3, 4);

        // display the string
        System.out.println(line);

        // testing and displaying getters and setters
        line.setBegin(new myPoint(5, 6));
        line.setEnd(new myPoint(7, 8));

        System.out.println("The Begin points: " + line.getBegin());
        System.out.println("The End points: " + line.getEnd());

        // displaying the length and gardient
        System.out.println("The Length: " + line.getLength());
        System.out.println("The Gradient: " + line.getGradient());
    }
}
