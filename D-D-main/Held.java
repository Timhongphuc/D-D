
/**
 * Das hier ist unser Held. Er kämpft gegen Monster und andere Bösewichte.
 * 
 * @author Tim Seufert (Timhongphuc)
 * @version V1.0, 25.03.2026
 */
public class Held {

    protected int hp;
    protected String name;
    protected int schaden;
    protected float geschwindigkeit;
    protected int verteidigung;
    protected int level;
    
    public Held(String pName, int pSchaden, 
    float pGeschwindigkeit, int pVerteidigung, int pLevel){
        hp = 100;
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
    public void attackMonster(Monster pMonster){
        pMonster.setHP(pMonster.getHP() -10);
    }
    public void attackHeld(Held pHeld){
        pHeld.setHP(pHeld.getHP() -10);
    }
    
    public void fight(Monster pMonster, Held pHeld){
        if (pMonster.getLevel() > pHeld.getLevel()){ //Monster gewinnt
            //pHeld.setHP(pHeld.getHP()-2); Wollte einen multiplikator machen, aber ist eigentlich useless
            attackHeld(pHeld);
            System.out.println(pMonster.getName() + " fügte dem Helden " + pHeld.getName() + " " + pHeld.getSchaden() + " zu.");
        } else if (pMonster.getLevel() < pHeld.getLevel()) { //Held gewinnt
            //pHeld.setHP(pHeld.getHP()-2);
            attackMonster(pMonster);
            System.out.println(pHeld.getName() + " fügte dem Monster " + pMonster.getName() + " " + pMonster.getSchaden() + " zu.");
        }
    }
}