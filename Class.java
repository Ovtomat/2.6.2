import java.util.Scanner;
 interface Moveable{
     void move(float dx, float dy);
     void resize(float koeff);
}
abstract class Figure {
    float x;
    float y;
    public Figure(float x, float y){
        this.x=x;
        this.y=y;
    }
    public abstract double getPerimeter();
}
class Rectangle extends Figure implements Moveable {
    float height;
    float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

    }

    public double getArea() {
        return this.height*this.width;

    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public void move(float dx,float dy){
        this.x=x+dx;
        this.y=y+dx;


    }
    public void resize(float coeff){
        this.width=this.width*coeff;
        this.height=this.height*coeff;



    }
    public String toString() {
        return "Rectangle"+"\n"+"Center: ("+(this.x+(this.width)/2)+"," +(this.y+(this.height)/2)+")"+"\n"+"Height: "+this.height+"\n"+"Width: "+this.width;
    }
}
class Circle extends Figure implements Moveable{

    float radius;
    public Circle(float x, float y, float radius) {
            super(x,y);
            this.x = x;
            this.y = y;
            this.radius = radius;


        }
    public double getArea() {
        return this.radius*this.radius*Math.PI;

    }
    public double getPerimeter() {
        return this.radius*Math.PI*2;

    }
    public void move(float dx,float dy){
        this.x=x+dx;
        this.y=y+dx;


    }
    public void resize(float coeff){
        this.radius=this.radius*coeff;



    }
    public String toString() {
        return "Circle"+"\n"+"Center: ("+this.x+"," +this.y+")"+"\n"+"Radius:"+this.radius;
    }


}
public class Class {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);




        }
    }




