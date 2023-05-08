package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.colors.Blue;
import CreationalDP.Abstract_FactoryDP.colors.Color;
import CreationalDP.Abstract_FactoryDP.colors.Green;
import CreationalDP.Abstract_FactoryDP.colors.Red;
import CreationalDP.Abstract_FactoryDP.shapes.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("KIRMIZI")) {
            return new Red();
        } else if (color.equalsIgnoreCase("YESIL")) {
            return new Green();
        } else if (color.equalsIgnoreCase("MAVI")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
