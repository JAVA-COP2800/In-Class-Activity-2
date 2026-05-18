/*
In-Class Activity (Student Starter with TODOs)
Part B: Circle Class (radius, area, circumference)

Goal:
Create a Circle class with a radius attribute that you can access and modify.
Calculate and display area and circumference.

Run:
  javac CircleLab_Starter.java
  java CircleLab_Starter
*/


public class CircleLab_Starter {

    // TODO 1: Create a Circle class BELOW (outside this class) with:
    // - private double radius;
    private double radius;

    // - constructor Circle(double radius)
    public CircleLab_Starter(double radius){
        this.radius = radius;
    }
    // - getRadius(), setRadius(double radius)
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius < 0 ) throw new IllegalArgumentException("Negative value not allowed"); // This prevents the negatives numbers to be passed since a negative radius is not mathematically correct.
        else this.radius = Math.abs(radius);
    }

    // - getArea(), getCircumference()
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        // TODO 2: Create a Circle object with radius 5.0
        CircleLab_Starter c = new CircleLab_Starter(5.0);


        // TODO 3: Print radius, area, circumference (2 decimals)
         System.out.printf("Radius: %.2f%n", c.getRadius());

        // TODO 4: Modify radius to 8.5 using setter, then print again
        c.setRadius(8.5);
        System.out.printf("Radius: %.2f%n", c.getRadius());

        // TODO 5 (Challenge): Prevent negative radius in setter
        //Done
    }
}
