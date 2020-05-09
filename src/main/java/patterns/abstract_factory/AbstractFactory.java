package patterns.abstract_factory;

import patterns.abstract_factory.colour.Color;
import patterns.abstract_factory.colour.ColorType;
import patterns.abstract_factory.shape.ShapeType;
import patterns.factory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(ColorType type);

    abstract Shape getShape(ShapeType type);
}
