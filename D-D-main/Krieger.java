
/**
 * Beschreiben Sie hier die Klasse Kriger.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Krieger extends Held {

    private int schild;
    
    public Krieger(String pName, int pSchaden, 
    float pGeschwindigkeit, int pVerteidigung, int pLevel, int pSchild){
    super(pName, pSchaden, pGeschwindigkeit, pVerteidigung, pLevel);
    hp = 100;
    schild = pSchild;
    }
    
    
}