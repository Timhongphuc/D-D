
/**
 * Beschreiben Sie hier die Klasse Waffe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waffe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int extraschaden;
    private String name;
    public Waffe(int pExtraschaden, String pName)
    {
        extraschaden = pExtraschaden;
        name = pName;
    }
    
    public int getExtraschaden(){
        return extraschaden;
    }
    public String getName(){
        return name;
    }
    
    public void setExtraschaden(int pExtraschaden){
        extraschaden = pExtraschaden;
    }
    public void setName(String pName){
        name = pName;
    }
    
    

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
}