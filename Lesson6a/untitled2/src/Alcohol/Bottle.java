package Alcohol;

public class Bottle<T extends Alcohol> {
    private T type;

    public void fill(T type) {
        this.type=type;
    }
    void describe(){
        if(type==null){
            System.out.println("Pusta butelka");
        }
        else {
            System.out.println("Ten alkohol to :"+type.getName()+"   "+"Procent: "+type.getPercentage());
        }
    }
}
