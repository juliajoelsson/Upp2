package se.miun.jujo2203.dt187g.jpaint;

/**Klassen är en superklass som lagrar information om färg
 * och skapar en lista/array för att lagra koordinaterna.
 */

public abstract class Shape implements Drawable{
    protected String color;
    protected Point[] points;

    public Shape(double x, double y, String color){
        points = new Point[2];
        points[0] = new Point(x, y);
        this.color = color;
    }

    public Shape(Point p, String color){
        points = new Point[2];
        points[0] = p;
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double getCircumference();

    public abstract double getArea();

    public void addPoint(Point p){
        points[1] = p;
    }

    public void addPoint(double x, double y){
        points[1] = new Point(x, y);
    }

    public abstract boolean hasEndpoint();
}
