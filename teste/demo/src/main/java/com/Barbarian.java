package com;


public class Barbarian extends Classes{
  private int rage, rageDamage;


  public int getRage() {
    return rage;
  }



  @Override
  public int start(){

    this.diceRoll();

    this.setClassName("Barbarian");
    this.setHp(12 + this.getCon());
    this.setRage(2);
    this.setRageDamage(2);
    this.setFeatures("Unarmored Defense");
    this.unarmoredDefense();
    return this.getHp();
  }  

  public void unarmoredDefense(){
    if(this.getAc()==0){
      this.setAc(10 + this.getBdex() + this.getBcon());
    }
    else{

    }
  }

  @Override
  public void levelUp(){
     
 
        }

  public void levelCheck(){
    if (this.getLvl() == 2){
      this.setHp(this.getHp());
    }
  }

        public void setRage(int rage) {
          this.rage = rage;
        }
      
        public int getRageDamage() {
          return rageDamage;
        }
      
        public void setRageDamage(int rageDamage) {
          this.rageDamage = rageDamage;
        }
     
   }  
  
