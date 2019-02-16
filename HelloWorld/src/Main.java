import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mynumber = 5;
        menu.mytext="kuba";
        System.out.println(menu.mynumber);
        System.out.println(menu.mytext);

        Kalkulator me = new Kalkulator();
        System.out.println(me.sum(2, 10));

        Menu write = new Menu();
        System.out.println(write.write(5, "git"));

        write.writetype();

        Menu setnum = new Menu();

        setnum.setMynumber(9);
        setnum.setMytext("jajaja");

        System.out.println(setnum.getMynumber());
        System.out.println(setnum.getMytext());

        System.out.println("wartosc domyslna zmiennej int: "+setnum.gettypint());
        System.out.println("wartosc domyslan obiektu Integer: " +setnum.gettypInt());
        System.out.println(menu.car);

        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        menu1.setMynumber(1);
        menu2.setMynumber(1);
        menu1.setCar(Marka.VOLKSWAGEN);
        if(menu1.getMynumber()>menu2.getMynumber()){
            System.out.println("Menu 1 jest wieksze od menu 2");
            menu1.car=Marka.TESLA;
            System.out.println(menu1.getCar());
        }
        else if(menu1.getMynumber()<menu2.getMynumber()){
            System.out.println("menu 1 jest mniejsze od menu 2");
            menu1.car=Marka.HONDA;
            System.out.println(menu1.getCar());
        }
        else if(menu1.getMynumber()== menu2.getMynumber()){
            System.out.println("1 jest rowne 2");
            System.out.println(menu1.getCar());
        }

        petla(45);
    }
        public static void petla(int liczba){
            for (int i = 0; i < liczba; i++) {
                if(i%2!=0) {
                    System.out.println(i);

                }
                if(i%11==0 && i!=0){
                    break;
                }

            }

        }
}

