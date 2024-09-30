package Question1;

public class myLine {
    private myPoint begin;
    private myPoint end;

    // constructors
    public myLine(int x1, int y1, int x2, int y2){
        begin = new myPoint(x1, y1);
        end = new myPoint(x2, y2);
    }

    public myLine(myPoint begin, myPoint end){ //fix
        this.begin = begin; // check line 
        this.end = end;
    }

    // getters and setters
    public myPoint getBegin(){
        return begin;
    }

    public void setBegin(myPoint begin){
        this.begin = begin; // sets begin
    }

    public myPoint getEnd(){
        return end;
    }

    public void setEnd(myPoint end) {
        this.end = end; // sets end
    }

      public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX(); //set ends of x
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y); // set ends of y
    }

    // returns both the x and y begin as an array
    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // gives length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // gives the slope of the line
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    // displays the return of the line with the start and end 
    @Override
    public String toString() {
        return "MyLine: [ begin = " + begin + ", end = " + end + "]";
    }

}
