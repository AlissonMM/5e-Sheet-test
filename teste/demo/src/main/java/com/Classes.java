package com;

import java.util.Arrays;

public class Classes extends Character{
    private String features, className;


    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int start(){
      
        return 0;
    }  

    public void diceRoll(){
        this.setStr(this.diceRandom());
        this.setDex(this.diceRandom());
        this.setCon(this.diceRandom());
        this.setInte(this.diceRandom());
        this.setWis(this.diceRandom());
        this.setCha(this.diceRandom());

    }

    static int diceRandom () {
    int n[] = new int[4];
    int s = 0;

     for(int i = 0; i <= 3; i++) {
        n[i] = (int) (1+(5 * Math.random()));
        }
         Arrays.sort(n);

    for(int i = 1; i <= 3; i++) {
        s += n[i];
    }
    return s;
}
  
    public void levelUp(){
   
          }
       
     }  
