//Name: Garrett Radtke
//Date: 10/7/25

public class Rectangle {
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    public Rectangle(double x1, double y1, double x2, double y2, 
                     double x3, double y3, double x4, double y4 ) { //forms a rectangle with the given coordinates and informs user about it
        setValues(x1, y1, x2, y2, x3, y3, x4, y4);
        System.out.println("The length is: " + Length());
        System.out.println("The width is: " + Width());
        System.out.println("The perimeter is: " + Perimeter());
        System.out.println("The area is: " + Area());
    }

    public void setValues(double x1, double y1, double x2, double y2, 
                          double x3, double y3, double x4, double y4 ) { //updates the coordinates of the rectangle
        if(!isRectangle(x1, y1, x2, y2, x3, y3, x4, y4)){
            throw new IllegalArgumentException("Coordinates must form a valid rectangle");
        } 
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        if (isSquare()){
            System.out.println("These coordinates form a square");
        }
    }

    public double Length() { //checks distance between topmost points
        return Distance(this.x4, this.y4, this.x1, this.y1);
    }

    public double Width() { //checks distance between leftmost points
        return Distance(this.x4, this.y4, this.x3, this.y3);
    }

    public double Perimeter() {
        double length = Length() * 2;
        double width = Width() * 2;
        return length + width;
    }

    public double Area() {
        return Length() * Width();

    }

    private boolean isRectangle(double x1, double y1, double x2, double y2, 
                          double x3, double y3, double x4, double y4 ) { // checks if the side lengths/diagonals are the same
        if (Distance(x1, y1, x2, y2) == Distance(x4, y4, x3, y3) && Distance(x4, y4, x1, y1) == Distance(x3, y3, x2, y2)) {
            if(Distance(x1, y1, x3, y3) == Distance(x4, y4, x2, y2)) {
                return true;
            } else {
                return false;
            }
        }  else {
            return false;
        }
    }

    public boolean isSquare() {
        return Length() == Width();
    }

    private double Distance(double x1, double y1, double x2, double y2) { // calculate distance between two points
        double run = x2 - x1;
        double rise = y2 - y1;
        return Math.sqrt(Math.pow(run, 2) + Math.pow(rise, 2));
    }
}
