public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width * height;
    } //переопределние метода вычисления площади для прямоугольника

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    } //переопределение метода вычисления периметра прямоугольника
}
