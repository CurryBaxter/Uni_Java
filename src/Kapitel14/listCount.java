package Kapitel14;

import java.util.ArrayList;
import java.util.TreeMap;
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

    TreeMap<Integer, String> int2String = new TreeMap<>();
        int2String.put(0,"null");
        int2String.put(1,"eins");
        int2String.put(2,"zwei");
        int2String.put(3,"drei");
        int2String.put(4,"vier");
        int2String.put(5,"fünf");
        int2String.put(6,"sechs");
        int2String.put(7,"sieben");
        int2String.put(8,"acht");
        int2String.put(9,"neun");

    // Übung 2
    public void setInsert( TreeSet<Integer> treeset , Integer maxVal ){
       int sum = 0;
       int i = 1;
        for (Integer element : treeset)
            sum = sum + element;
        while ( maxVal> sum + i) {
            boolean iAdded = treeset.add(i);
            if (iAdded){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }

    // Übung 3

    public String int2String (int a){
        String intAlsString = String.valueOf(a);
        int loopLength = intAlsString.length();
        int i = 0;
        String result = "";
        //String element ="";
        while (i <= loopLength - 1){
            char ch = intAlsString.charAt(i);
            result = result + int2String.get(i);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        //Test von Methode listCounts zur Überprüfung von großen "D" in Liste
       //ArrayList<String> neueListe = new ArrayList<>();
       //neueListe.add("daniel");
       //neueListe.add("Peter");
       //neueListe.add("dieter");
       //neueListe.add("Hans");

       listCount bra = new listCount();
       //System.out.println(bra.listCounts(neueListe));
        // Test 1 ende

        // Test 2
      //TreeSet<Integer> Tree = new TreeSet<>();
      //Tree.add(2);
      //Tree.add(4);
      //Tree.add(1);
      //Tree.add(6);
      //Tree.add(5);
      //System.out.println(Tree);
      //bra.setInsert(Tree, 44);
      //System.out.println(Tree);

        // Test 3
       //TreeMap<Integer, String> int2String = new TreeMap<>();
       //int2String.put(0,"null");
       //int2String.put(1,"eins");
       //int2String.put(2,"zwei");
       //int2String.put(3,"drei");
       //int2String.put(4,"vier");
       //int2String.put(5,"fünf");
       //int2String.put(6,"sechs");
       //int2String.put(7,"sieben");
       //int2String.put(8,"acht");
       //int2String.put(9,"neun");
        bra.int2String(24);



    }
}
