package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.colors.Color;
import CreationalDP.Abstract_FactoryDP.shapes.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {


        //!!! SEKIL Fabrikasi cagriliyor
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SEKIL");

        Shape shape1 = shapeFactory.getShape("DAIRE");
        shape1.draw();


        Shape shape2 = shapeFactory.getShape("DIKDORTGEN");
        shape2.draw();


        //!!! RENK Fabrikasi cagriliyor
        AbstractFactory colorFactory = FactoryProducer.getFactory("RENK");

        Color color1 = colorFactory.getColor("KIRMIZI");
        color1.fil();

        Color color2 = colorFactory.getColor("MAVI");
        color2.fil();

    }

}
