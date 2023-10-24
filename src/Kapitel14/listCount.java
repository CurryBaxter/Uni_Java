package Kapitel14;

import java.util.ArrayList;
import java.util.TreeSet;

public class listCount {
    // Übung 1
    public int listCounts(ArrayList<String> Liste){
        int result = 0;
        for (String element : Liste){
            char firstChar = element.charAt(0);
            boolean charIsD = firstChar == 'D';
            if (charIsD){
                ++result;
            }
        }
        return result;
    }
    // Übung 2
    public void setInsert(TreeSet<Integer> treeset , Integer maxVal ){
        int sum = 0;
        for (Integer element : treeset){
            sum =+ element;

        }
    }

    public static void main(String[] args) {
        //Test von Methode listCounts zur Überprüfung von großen "D" in Liste
        ArrayList<String> neueListe = new ArrayList<>();
        neueListe.add("daniel");
        neueListe.add("Peter");
        neueListe.add("dieter");
        neueListe.add("Hans");

        listCount bra = new listCount();
        System.out.println(bra.listCounts(neueListe));
        // Test 1 ende



    }
}
