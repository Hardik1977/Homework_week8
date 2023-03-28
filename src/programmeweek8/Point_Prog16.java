package programmeweek8;
/**
 * 16 Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields
 * (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters x and y of type int and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance between this
 * Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance between this
 * Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE:  Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */
public class Point_Prog16 {
//instance variable
    int x;
    int y;

    //constructor with zero args
    Point_Prog16(){

    }
    //parameterised constructor
    Point_Prog16(int x, int y){
        this.x = y;
        this.y = x;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int a){                            //Method initialisation
        this.x = a;
    }
    public void setY(int b){                             //Method initialisation
        this.y = b;

    }
    public double distance(){                           //Method initialisation
        return distance(0, 0);
    }
    public double distance(int x, int y){               //Method initialisation
        return Math.sqrt((x - getX()) * (x - getY()) * (y - getY()) * (y - getY()));
    }
    public double distance(Point_Prog16 secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Point_Prog16 first = new Point_Prog16(6,5);                     //value passing
        Point_Prog16 second = new Point_Prog16(3,1);
        System.out.println("distance(0,0)= " + first.distance());           //Print display
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_Prog16 point = new Point_Prog16();                            //Object creation
        System.out.println("distance()= " + point.distance());

    }
}
