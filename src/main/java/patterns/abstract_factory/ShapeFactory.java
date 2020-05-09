package patterns.abstract_factory;

import patterns.abstract_factory.shape.*;

public class ShapeFactory {
    public Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("unknown type " + type);
        }
    }
}
