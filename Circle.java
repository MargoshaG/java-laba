
    public class Circle implements Figure{
        private double radius=0;
        public Circle(double radius){
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        @Override
        public double getSquare(){ //переопределение метода для вычисления площади окружности
            return Math.PI * Math.pow(radius,2);
        }
        @Override
        public double getPerimeter(){ //переопределение метода для вычисления периметра окружности
            return 2*Math.PI * radius;
        }
}
