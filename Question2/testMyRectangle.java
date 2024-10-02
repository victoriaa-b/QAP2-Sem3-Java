package Question2;

import Question1.myPoint;

public class testMyRectangle {
    public static void main(String[] args) {
        myRectangle rectangle = new myRectangle(new myPoint(1, 4), new myPoint(5, 1));

        // display 
        System.out.println(rectangle);

        rectangle.setTopLeft(new myPoint(3,6));
        rectangle.setBottomRight(new myPoint(7,3));

          //displaying the getters and setters
        System.out.println("The points of the TopLeft: " + rectangle.getTopLeft());
        System.out.println("The points of the BottomRight: " + rectangle.getBottomRight());
        
        // displaying perimeter and area
        System.out.println("The Perimeter: " + rectangle.getPerimeter());
        System.out.println("The Area: " + rectangle.getArea());
    }
}
