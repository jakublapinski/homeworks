package figure;

abstract class  Figure {
    abstract double calculateArea();

}
class Triangle extends Figure {
    private double side;
    private double height;


    public Triangle(double side, double height){
        this.side=side;
        this.height=height;
    }

    @Override
    double calculateArea() {
        return 0.5*height*side;

    }
}
class Recentagle extends Figure {
    private double side;
    private double height;
    public Recentagle(double side,double height){


    }
    @Override
    double calculateArea() {

        return height*side;
    }
}

