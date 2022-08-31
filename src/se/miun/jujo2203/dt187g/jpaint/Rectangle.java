package se.miun.jujo2203.dt187g.jpaint;
import java.awt.Graphics;

/**Klassen beräknar både längd, bredd, area och omkrets med
 * hjälp av koordinaterna som lagrats i en array. Klassen är
 * en subklass till superklassen Shape.
 */

public class Rectangle extends Shape {

    public Rectangle(Point p, String color) {
        super(p, color);
    }

    public Rectangle(double x, double y, String color) {
        super(x, y, color);
        
    }

    public double getWidth(){
        double width;
        double w1 = points[0].getX();
        double w2 = points[1].getX();

        if(points[1] == null) {
            return -1;
        } else if(w1 < w2){
            width = w2 - w1;
        } else {
            width = w1 - w2;
        }
        return width;
    }

    public double getHeight(){
        double height;
        double h1 = points[0].getY();
        double h2 = points[1].getY();
        
        if(points[1] == null) {
            return -1;
        } else if (h1 < h2) {
            height = h2 - h1;
        } else {
            height = h1 - h2;
        }
        return height;
    }

    @Override
    public double getCircumference() {
        if(points[1] == null || points[0] == null) {
            return -1;
        } else {
            return (getWidth() * 2) + (getHeight() * 2);
        }
        
    }

    @Override
    public double getArea() {
        if(points[1] == null || points[0] == null) {
            return -1;
        } else {
            return getHeight() * getWidth();
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

    @Override
    public String toString(){
        if(points[1] == null){
            return "Rectangle[start=" + points[0] + "; end=" + points[1] + 
            "; width=N/A; height= N/A; color=" 
            + getColor() + "]";
        } else {
            return "Rectangle[start=" + points[0] + "; end=" + points[1] + 
        "; width=" + getWidth() + "; height=" + getHeight() + ";color=" 
        + getColor() + "]";
        }
    }
    
}
