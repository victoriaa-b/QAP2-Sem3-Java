package Question2;
import Question1.myPoint;

// remember to draw class

public class myRectangle {
    private myPoint topLeft;
    private myPoint bottomRight;

    // constructors
    public myRectangle(myPoint topLeft, myPoint bottomRight) { // check if public or private
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // getter and setters
    public myRectangle(int x1, int x2, int y1, int y2) {
        this.topLeft = new myPoint(x1, y1);
        this.bottomRight = new myPoint(x2, y2);
    }

    public myPoint getTopLeft(){
        return topLeft;
    }

    public void setTopLeft(myPoint topLeft){
        this.topLeft = topLeft;
    }
    
    public myPoint getBottomRight(){
        return bottomRight;
    }

    public void setBottomRight(myPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getPerimeter(){
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        
        return 2 * (height + width);
    }

    public double getArea(){
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        double width = Math.abs(topLeft.getX() - bottomRight.getX());

        return height * width;
    }

    @Override
    public String toString() {
        return "myRectangle: topLeft = " + topLeft + ", bottomRight = " + bottomRight + "]";
    }
}
