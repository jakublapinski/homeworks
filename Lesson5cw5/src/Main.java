public class Main {

    public static void main(String[] args) {
        StringBuilder text=new StringBuilder();
        text.append("to#");
        text.append("jest#");
        text.append("nowy#");
        text.append("tekst");
        System.out.println(text);
        String s=text.toString();
        String[] sArray=s.split("#");
        for(int i=0;i<sArray.length;i++){
            System.out.println(sArray[i]);

        }
        System.out.println("Rozmia; "+sArray.length);
    }
}
