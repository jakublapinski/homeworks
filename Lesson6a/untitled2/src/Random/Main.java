package Random;

public class Main {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i < 2000000; i++) {

            int podzielnik = 2;

            boolean liczbaPierwsza = true;

            if (i > 3) {

                while (podzielnik < i) {
                    if (i % podzielnik == 0) {

                        liczbaPierwsza = false;break;

                    }
                    podzielnik++;}

            }
            if (liczbaPierwsza) {

                a++;
                if(i!=1){
                System.out.println("Liczba pierwsza: " + i);}

            }

        }
        System.out.println("Wylosowano: "+(a-1));
    }
}
