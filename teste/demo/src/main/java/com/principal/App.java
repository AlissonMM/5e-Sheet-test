package com.principal;
import com.Barbarian;
import com.CharacterSheet;


/**
 * Hello world!
 *
 */
public class App 
{
        public static void main(String[] args) {
    Barbarian barbarian = new Barbarian();


        
    barbarian.start();

    barbarian.human();

    barbarian.setName("Mangnom");


    /*Teste de saida 
    System.out.println(vida);
    System.out.println(barbarian.getName());
    System.out.println(barbarian.getRage());
    System.out.println(barbarian.getRageDamage());
    System.out.println(barbarian.getFeatures());
    System.out.println(barbarian.getAc());
     */  

    /*Teste de atributos */
    System.out.println("Força: " + barbarian.getStr());
    System.out.println("Destreza: " + barbarian.getDex());
    System.out.println("Constituição: " + barbarian.getCon());
    System.out.println("Inteligência: " + barbarian.getInte());
    System.out.println("Sabedoria: " + barbarian.getWis());
    System.out.println("Carisma: " + barbarian.getCha());
    
    

    /*Teste de criar PDF */
   CharacterSheet characterSheet = new CharacterSheet();

   characterSheet.Sheet(barbarian.getName(), barbarian.getClassName(), barbarian.getLvl());

}
}
