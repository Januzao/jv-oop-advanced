package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius < 0) {
            throw new IllegalArgumentException("radius must be positive.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: " + findArea() + " sq. units"
                + ", radius: " + radius + " units"
                + ", color: " + getColor());
    }

    @Override
    public double findArea() {
        return roundTo(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double roundTo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
