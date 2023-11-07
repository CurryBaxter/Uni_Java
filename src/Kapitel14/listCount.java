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

    private TreeMap<Integer,String> ziffernToStrings = null;
    private void initTreemap(){
        if (ziffernToStrings == null){
            ziffernToStrings = new TreeMap<>();
            ziffernToStrings.put(0,"Null");
            ziffernToStrings.put(1,"Eins");
            ziffernToStrings.put(2,"Zwei");
            ziffernToStrings.put(3,"Drei");
            ziffernToStrings.put(4,"Vier");
            ziffernToStrings.put(5,"Fünf");
            ziffernToStrings.put(6,"Sechs");
            ziffernToStrings.put(7,"Sieben");
            ziffernToStrings.put(8,"Acht");
            ziffernToStrings.put(9,"Neun");
        }
    }
    public String int2String (int a){
        initTreemap();

        String intAlsString = String.valueOf(a);
        StringBuilder result = new StringBuilder();

        for (int i = 0;i < intAlsString.length();++i){
            char ch = intAlsString.charAt(i);
            String chTostring = Character.toString(ch);
            int chAsInt = Integer.parseInt(chTostring);
            String zifferAusgeschrieben = ziffernToStrings.get(chAsInt);
            result.append(zifferAusgeschrieben);
        }
        return result.toString();
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

        // Test 3
        String test1 = "Hallo";
        String test2 = "Welt";
        System.out.println(test1 + test2);
        System.out.println(bra.int2String(23));

    }
}
