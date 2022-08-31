package se.miun.jujo2203.dt187g.jpaint;
import java.awt.Graphics;

/**Klassen Circle är en subklass till Shape. 
 * Här beräknas bland annat en cirkels omkrets och 
 * area utifrån koordinater i ett
 * koordiatsystem
 */

public class Circle extends Shape {
    protected double PI = 3.14;

    public Circle(double x, double y, String color) {
        super(x, y, color);
    }

    public Circle(Point p, String color) {
        super(p, color);
    }

    public double getRadius(){
        if(points[1] == null || points[0] == null) {
            return -1;
        } else {
            double w = points[0].getX() - points[1].getX();
            double h = points[0].getY() - points[1].getY();
            double r = Math.sqrt((w*w) + (h*h));
            return r;
        }
    }

    @Override
    public double getCircumference() {
        if(points[1] == null || points[0] == null) {

            return -1;
        } else {
            double c = (2*PI*getRadius());
            return c;
        }
    }

    @Override
    public double getArea() {

        if(points[1] == null || points[0] == null) {
            return -1;
        } else {
            double a = (PI*getRadius()*getRadius());
            return a;
        }
    }

    @Override
    public boolean hasEndpoint() {
        if(points[1] == null || points[0] == null) {
            return false;
        } else{
            return true;
        }
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public void draw(Graphics g) {
        
    }

    public String toString(){
        if(points[1] == null) {
            return "Circle[start="+ points[0] + "; end=" + points[1] + "; radius=N/A; color=" + color +"]";
        } else {
            return "Circle[start="+ points[0] + "; end=" + points[1] + "; radius=" + getRadius() + "; color=" + color +"]";
        }
    }
    
}
