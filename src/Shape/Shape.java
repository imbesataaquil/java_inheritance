package Shape;

public class Shape {
    double getArea(){
       return 0;
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double getArea(){
        return 3.14*radius*radius;
    }
}
class Square extends Shape{
    int length;
    Square(int length){
        this.length=length;
    }
    double getArea(){
        return length*length;
    }
}
class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(int width,int height) {
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return width*height;
    }
}
class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(6);
        Shape rectancle = new Rectangle(7,8);
        System.out.println("area of circle is = "+circle.getArea());
        System.out.println("area of square is = "+square.getArea());
        System.out.println("area of rectangle is = "+rectancle.getArea());

    }
}