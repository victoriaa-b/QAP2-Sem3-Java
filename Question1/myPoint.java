package Question1;  
public class myPoint {
    // store x and y
    private int x;
    private int y;

   // constructor
    public myPoint(){
        this(0,0);

    }

    public myPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

 // setting up the getter and setters
    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;

    }
    public int getY() {
        return y;
    }

    public void setY(int y){
        this.y = y;

    }

    // returns as an array?
    // double check 
    public int[] getXY(){
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // calculates the distances between the two points
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
     
    // calculates the distance with another myPoint object
    
    public double distance(myPoint another) {
        return distance(another.getX(), another.getY());
    }

    // provides a display of the points
     @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }


}