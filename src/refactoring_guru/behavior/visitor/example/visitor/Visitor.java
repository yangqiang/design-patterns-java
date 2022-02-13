package refactoring_guru.behavior.visitor.example.visitor;

import refactoring_guru.behavior.visitor.example.shapes.Circle;
import refactoring_guru.behavior.visitor.example.shapes.CompoundShape;
import refactoring_guru.behavior.visitor.example.shapes.Dot;
import refactoring_guru.behavior.visitor.example.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
