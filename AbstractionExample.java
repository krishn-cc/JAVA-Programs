abstract class Shape{

    abstract void draw();
    void Display(){
        System.out.println("This is a shape ");
    }

}
class Circle extends Shape{
    void draw(){
        System.out.println("Drwaing a Circle");
    }

}


public class AbstractionExample {
    public static void main(String[] args) {
        Shape S= new Circle();
        S.draw();
        S.Display();

    }
}
