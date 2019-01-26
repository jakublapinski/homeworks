package figure;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(5);
        System.out.println(sq.calculateArea());
         Square sq2=new Square();
        sq2.setSide(5);
        System.out.println(sq2.toString());
        System.out.println(sq2.equals(sq));
        System.out.println(sq2.hashCode());


        Triangle trojkat=new Triangle(10,20);


        System.out.println(trojkat.calculateArea());

    }

}