interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.draw();
        s.draw();
    }
}