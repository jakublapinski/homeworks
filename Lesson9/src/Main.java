public class Main {

    public static void main(String[] args) {
        int[] tablica = new int[10];
        int[] tbalica2 =new int[0];
        int [][] tablica3=new int[10][10];
//        for (int i=0; i<tablica.length;i++){
//            tablica[i]=i;
//            System.out.println(tablica[i]);
//        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                tablica3[i][j]=i+j;
                System.out.println(tablica3[i][j]);

            }
        }
    }
}
