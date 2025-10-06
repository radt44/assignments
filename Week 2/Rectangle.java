public class Rectangle {
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    public Rectangle(double x1, double y1, double x2, double y2, 
                     double x3, double y3, double x4, double y4 ) {
        setValues(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void setValues(double x1, double y1, double x2, double y2, 
                          double x3, double y3, double x4, double y4 ) {
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
        Length();
        Width();
        Perimeter();
    }

    public void Length() {
        System.out.println("The length is: " + Distance(this.x2, this.x1));
    }

    public void Width() {
        System.out.println("The width is: " + Distance(this.y1, this.y3));
    }

    public void Perimeter() {
        double length = Distance(this.x2, this.x1) * 2;
        double width = Distance(this.y1, this.y3) * 2;
        double perimeter = length + width;
        System.out.println("The perimeter is: " + perimeter);
    }

    public void Area() {

    }

    private boolean isRectangle(double x1, double y1, double x2, double y2, 
                          double x3, double y3, double x4, double y4 ) {
        if (Distance(x2, x1) == Distance(x4, x3) && Distance(y2, y1) == Distance(y4, y3)) {
            return true;
        }  else {
            return false;
        }
    }

    private boolean isSquare() {
        return true;
    }

    private double Distance(double a, double b){
        double run = a - b;
        return run;
    }
}
