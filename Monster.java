
/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author (Richard Mack) 
 * @version (25.03.2026)
 */
public class Monster
{
    protected int hp;
   
    protected int schaden;
    protected int verteidigung;
    

    /**
     * Konstruktor für Objekte der Klasse Monster
     */
    public Monster(int pHp,int pSchaden, int pVerteidigung)
    {
        
        hp = pHp;
        schaden = pSchaden;
        verteidigung = pVerteidigung;
       
    }

    public int getHp()
    {
        return hp;
    }
    
    public int getSchaden()
    {
        return schaden;
    }
    public int getVerteidigung()
    {
        return verteidigung;
    }
    
    
    public void setHp(int pHp)
    {
        hp = pHp;
    }
    
    public void setSchaden(int pSchaden)
    {
        schaden = pSchaden;
    }
    public void setVerteidigung(int pVerteidigung)
    {
        verteidigung = pVerteidigung;
    }
    
}