package Kapitel6;

public class simpleBoolDecider {

    public boolean BoolDecider(double arg1,double arg2){
        if (arg1 < 5 || (arg1 + arg2)> 100  ){
            return false;
        }
        else{
            return true;
        }
    }

        public boolean Booldecider2 (double arg1, double arg2){
            return BoolDecider(arg1, arg2) && arg1 > arg2;
        }



    public static void main(String[] args) {
        //simpleBoolDecider Decider1 = new simpleBoolDecider();
        //System.out.println(Decider1.BoolDecider(43,5));
        simpleBoolDecider Decider2 = new simpleBoolDecider();
        System.out.println(Decider2.Booldecider2(43, 5));
    }
}
