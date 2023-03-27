public class menu {

    public static void main(String[] args) { //главный метод
        Circle circle = new Circle(7); //создание объекта класса
        System.out.print("S круга: ");
        System.out.println(circle.getSquare()); //вывод результата
        System.out.print("P круга: ");
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(9,12);
        System.out.print("S прямоугольника: ");
        System.out.println(rectangle.getSquare());
        System.out.print("P прямоугольника: ");
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(6,8,10);
        System.out.print("S треугольника: ");
        System.out.println(triangle.getSquare());
        System.out.print("P треугольника: ");
        System.out.println(triangle.getPerimeter());

        Ellipse ellipse = new Ellipse(19, 29);
        System.out.print("S эллипса: ");
        System.out.println(ellipse.getSquare());
        System.out.print("P эллипса: ");
        System.out.println(ellipse.getPerimeter());
    }
}
