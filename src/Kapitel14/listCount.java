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
    public void setInsert( TreeSet<Integer> treeset , Integer maxVal ){
       int sum = 0;
       int i = 1;
        for (Integer element : treeset)
            sum = sum + element;
        while ( maxVal> sum + i) {
            boolean iAdded = treeset.add(i);
            if (iAdded){
                sum = sum + i;// Debug: Schleife addiert auf Summe in jedem Durchlauf, obwohl i nicht immer dem treeset zugefügt wird
            }
            i++;
        }
        System.out.println(sum);
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

        // Test 2
        TreeSet<Integer> Tree = new TreeSet<>();
        Tree.add(2);
        Tree.add(4);
        Tree.add(1);
        Tree.add(6);
        Tree.add(5);
        System.out.println(Tree);
        bra.setInsert(Tree, 44);
        System.out.println(Tree);


    }
}
