package Kaffemaschine;

import java.util.Objects;

public class MilkContainer {
     private float inhalt;



     public void setInhalt(float _Inhalt){
         inhalt = _Inhalt;
     }


     public float getInhalt(){
         return inhalt;
     }

     public MilkContainer (){
         inhalt = 0;
     }

     public void MilchNachfuellen (float _Milch){
         inhalt =+ _Milch;
    }

    public void MilchSchaeumen (String lorem){
         if (Objects.equals(lorem, "Cappucino")){
             inhalt =- 20;
         }
    }
}
