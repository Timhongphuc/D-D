//Filip Roessner
//67.67.6767
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public abstract class Held
{
    protected int hp;
    protected String name;
    protected int schaden;
    
    
    /**
     * Konstruktor für Objekte der Klasse Held
     */
    public Held(int hp,
    String name,
    int schaden
   )
    {
        this.hp = hp;
        this.name = name;
        this.schaden = schaden;
    }

    public int getHP(){
        return hp;
    }
    public String getName(){
        return name;
    }
    public int getSchaden(){
        return schaden;
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
   
   
    
    public void heilen(int heilen ){
        
        
    } 
}