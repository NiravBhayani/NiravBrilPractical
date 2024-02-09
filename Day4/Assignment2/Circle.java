package Day4.Assignment2;

public class Circle {
    private double PI = 3.14;
    private double radius;

    public Circle(){
        this.radius = radius;
    }

    public double Area(double radius){
        return PI * radius * radius;
    }
    public double Area(long radius){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        System.out.println("Area for radius 3 is : " + circle1.Area(3L));
        System.out.println("Area for radius 5.6 is : " + circle2.Area(5.6d));
    }
}
