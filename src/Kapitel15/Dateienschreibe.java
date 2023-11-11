package Kapitel15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Dateienschreibe {

    RandomAccessFile testDatei = new RandomAccessFile("/home/felix/Dokumente/javatest.txt", "rw");

    public Dateienschreibe() throws FileNotFoundException {}
    public ArrayList<Integer> initArraylist(){
        ArrayList<Integer>IntList = new ArrayList<>();
        IntList.add(0);
        IntList.add(1);
        IntList.add(2);
        IntList.add(3);
        IntList.add(4);
        IntList.add(5);
        IntList.add(6);
        IntList.add(7);
        IntList.add(8);
        IntList.add(9);
       return IntList;
    }
    public void writeList (ArrayList<Integer> liste, String pfad) throws IOException {
    for (int element : liste){
        testDatei.writeInt(element);
    }
    testDatei.close();
    }
    public static void main(String[] args) throws IOException {
        Dateienschreibe Test = new Dateienschreibe();

        Test.writeList(Test.initArraylist(), "/home/felix/Dokumente/javatest.txt");

    }
}
