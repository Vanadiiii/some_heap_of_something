package patterns.factory;

public class  FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape(ShapeType.CIRCLE);
        shape1.draw();
        Shape shape2 = factory.getShape(ShapeType.SQUARE);
        shape2.draw();
        Shape shape3 = factory.getShape(ShapeType.RECTANGLE);
        shape3.draw();
    }
}
