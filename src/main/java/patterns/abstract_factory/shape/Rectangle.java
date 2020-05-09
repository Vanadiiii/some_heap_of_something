package patterns.abstract_factory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw the rectangle");
    }
}
