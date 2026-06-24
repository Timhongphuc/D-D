
/**
 * Beschreiben Sie hier die Klasse Sahur.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sahur extends Held
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int schlaeger;
    private int a;
   
    
    
    
    
    
    /**
     * Konstruktor für Objekte der Klasse Sahur
     */;
    protected int[] Waffenhalter = new int[2];
    public Sahur(int hp,
    String name,
    int schaden,
     int pschlaeger
      )
    {
        super(hp, name, schaden);
        schlaeger = pschlaeger;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int newHauen(){
        if(Waffenhalter[0]< Waffenhalter[1])a =  Waffenhalter[1]; else a= Waffenhalter[0];
        return schlaeger + getSchaden() + a ;
        
    }
    public void claimWaffe(){
       
    }
}