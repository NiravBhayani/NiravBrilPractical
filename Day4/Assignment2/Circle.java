package Day4.Assignment2;

public class Circle {
    private double PI = 3.14;
    private double radius;
    public double area(double radius){
        return PI * radius * radius;
    }
    public double area(long radius){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("Area for radius 3 is : " + circle1.area(3));
        System.out.println("Area for radius 5.6 is : " + circle1.area(5.6));
    }
}
