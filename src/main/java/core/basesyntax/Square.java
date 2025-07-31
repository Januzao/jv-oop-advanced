package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        if (side < 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }

        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area: " + findArea() + " sq. units"
                + ", side: " + side + " units"
                + ", color: " + getColor());
    }

    @Override
    public double findArea() {
        return roundTo(side * side);
    }

    @Override
    public double roundTo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
