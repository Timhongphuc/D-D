
/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author Tim Seufert (Timhongphuc)
 * @version V1.0, 25.03.2026
 */
public class Held {

    private int hp;
    private String name;
    private int schaden;
    private float geschwindigkeit;
    private int verteidigung;
    private int level;
    
    public Held(int pHp, String pName, int pSchaden, 
    float pGeschwindigkeit, int pVerteidigung, int pLevel){
        hp = pHp;
        name = pName;
        schaden = pSchaden;
        geschwindigkeit = pGeschwindigkeit;
        verteidigung = pVerteidigung;
        level = pLevel;
    }

    public int getHP(){ //Why do we do it this way? (Have to do some research...)
        return hp;
    }
    public String getName(){
        return name;
    }
    public int getSchaden(){
        return schaden;
    }
    public float getGeschwindigkeit(){
        return geschwindigkeit;
    }
    public int getVerteidigung(){
        return verteidigung;
    }
    public int getLevel(){
        return level;
    }
    
    
    public void setHP(int pHp){
        hp = pHp;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setSchaden(int pSchaden){
        schaden = pSchaden;
    }
    public void setGeschwindigkeit(float pGeschwindigkeit){
        geschwindigkeit = pGeschwindigkeit;
    }
    public void setVerteidigung(int pVerteidigung){
        verteidigung = pVerteidigung;
    }
    public void setLevel(int pLevel){
        level = pLevel;
    }
    
    
    public void heal(int heal){
        //heal = hp++; //??? FIX IT!
        //setHP(hp); //FIX IT!
    }
    public void attack(){
        //CCCCC
    }
}