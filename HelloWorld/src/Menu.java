public class Menu {
    int mynumber;
    String mytext;
    int mynumber2;
    String mytext2;
    int typint;
    Integer typInt;
    Marka car;
    int number;

    Menu() {
        mytext2="jslkl";
        mynumber2 = 2 * mynumber;
    }
    public String write(int num, String text){
        return "*"+num+"-"+text+"*";
    }
    public void writetype(){
        System.out.println(mytext2.getClass());
    }

    public int getMynumber() {
        return mynumber;
    }

    public String getMytext() {
        return mytext;
    }

    public void setMynumber(int mynumber) {
        this.mynumber = mynumber;
    }

    public void setMytext(String mytext) {
        this.mytext = mytext;
    }

    public int gettypint(){
        return typint;
    }
    public Integer gettypInt(){
        return typInt;
    }

    public Marka getCar() {
        return car;
    }

    public void setCar(Marka car) {
        this.car = car;
    }
}


