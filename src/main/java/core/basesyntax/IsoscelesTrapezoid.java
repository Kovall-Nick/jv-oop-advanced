package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first side: " + getFirstSide() + " units, second side: "
                + getSecondSide() + " units, third side: " + getThirdSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2.0) * thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}
