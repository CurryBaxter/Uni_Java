package Kapitel7;

import java.util.Arrays;

public class arraySum {
    public int array_sum(int[] intArray){
        int sum = 0;

        for (int i = 0; i < intArray.length; ++i ){
            sum += intArray[i];
        }
        return sum;
    }
    public int array_sum_twist(int[] intArray){
        int sum = 0;

        for (int i = 0; i < intArray.length; ++i) {
            // Wir nutzen den Fragezeichen-Operator: wenn der Wert aus dem Array nicht gr��er als 10 ist,
            // summieren wir 0, ansonsten summieren wir den Wert aus dem Array
            sum += intArray[i] > 10 ? intArray[i] : 0;
        }
        return sum;

    }

    public int arrayDeterminante(int[][] Matrix){
        if (Matrix.length != 2){
            return 0;
        }
        for (int i = 0; i < Matrix.length; ++i){
            if (Matrix[i].length != 2 ){
                return 0;
            }


        }
        return Matrix[0][0] * Matrix[1][1] - Matrix[0][1] + Matrix[1][0];
    }

    public static void main(String[] args) {
        arraySum kap7 = new arraySum();


        int[] sumArray = {4,7,9,13,17,3,20};
        System.out.println(kap7.array_sum(sumArray));
        System.out.println(kap7.array_sum_twist(sumArray));

        int[][] validMatrix = {{2,4},{3,8}};


        System.out.println(kap7.arrayDeterminante(validMatrix));
        //System.out.println(Arrays.deepToString(validMatrix));
    }
}
