package Kapitel6;

public class maximumSum {

    public int max_sum(int a){
        int sum = 0;
        int num = 1;
        if (a <= 0){
            return 0;
        }
        while (sum + num <= a){
            sum += num;
            num++;

        }
        return sum;
    }

    public static void main(String[] args) {
        maximumSum Max_Summe = new maximumSum();
        System.out.println(Max_Summe.max_sum(16));
    }
}
