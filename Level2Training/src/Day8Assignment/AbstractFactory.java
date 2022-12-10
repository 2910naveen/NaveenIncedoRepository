package Day8Assignment;

public interface AbstractFactory extends ShapeFactory,RoundedShapeFactory
{
    Shape getShape();
}
