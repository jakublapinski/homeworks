package zad5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* List<String> names = new ArrayList<>();
        names.add("shdg");
        names.add("dhfos");
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        Map<Integer, List<String>> Mapa = new TreeMap<>();
        Mapa.put(1, names);
        Mapa.put(2, colors);
        List<String> join = new ArrayList<>();
        join.addAll(names);
        join.addAll(colors);
        List<String> myNewList = new ArrayList<String>(new HashSet<>(join));*/

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("/home/jakublapinski/IdeaProjects/Lesson5cw5/src/zad5/plik.txt"));
            String l;
            while ((l=in.readLine())!=null){
                System.out.println(l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}