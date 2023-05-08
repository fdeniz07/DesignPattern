package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.colors.Color;
import CreationalDP.Abstract_FactoryDP.shapes.Shape;


public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);


}
