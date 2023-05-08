package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.colors.Color;
import CreationalDP.Abstract_FactoryDP.shapes.Circle;
import CreationalDP.Abstract_FactoryDP.shapes.Rectangle;
import CreationalDP.Abstract_FactoryDP.shapes.Shape;
import CreationalDP.Abstract_FactoryDP.shapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

   @Override
    Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("DAIRE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("DIKDORTGEN")) {
            return new Rectangle();

        } else if (shape.equalsIgnoreCase("KARE")) {
            return new Square();
        }
        return null;
    }
}
