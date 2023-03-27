public class Ellipse implements Figure{
    private double a=0;
    private double b=0;
    public Ellipse(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getSquare(){  //переопределение метода вычисления площади
        return Math.PI *a*b;
    }
    @Override
    public double getPerimeter(){ //переопределение метода вычисления периметра
        return 2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    }
}
