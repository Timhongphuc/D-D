
/**
 * Beschreiben Sie hier die Klasse Kriger.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Monster extends Held {

//private int schleim;
    
public Monster(String pName, int pSchaden, 
float pGeschwindigkeit, int pVerteidigung, int pLevel){
    super(pName, pSchaden, pGeschwindigkeit, pVerteidigung, pLevel);
    //schleim = pSchleim;
    hp = 100;
    }
}