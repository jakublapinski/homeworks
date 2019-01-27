package Alcohol;

public class Main {
    public static void main(String[] args) {
        Piwo beer =new Piwo("Dzik",8.4);

       // System.out.println("Nazwa: "+beer.getName()+"  "+"Procent:"+beer.getPercentage());
        Bottle<Piwo>browar=new Bottle<Piwo>();
        beer.getPercentage();
        beer.getName();
        browar.fill(beer);
    }
}
