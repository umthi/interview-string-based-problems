package epam;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing square");
    }
}

class FactoryClass {
    public Shape getShape(String str) {
        return switch (str) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}

public class FactoryPatternClass {
    public static void main(String[] args) {
        String str = "SQUARE";
        FactoryClass fc = new FactoryClass();
        Shape sh = fc.getShape(str);
        sh.draw();
    }
}
