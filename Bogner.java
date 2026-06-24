
/**
 * Beschreiben Sie hier die Klasse Bogner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bogner extends Held
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int bogen;

    /**
     * Konstruktor für Objekte der Klasse Bogner
     */
    public Bogner(int hp,
    String name,
    int schaden,
    float geschiwindigkeit,
    int verteiligung,
    
    float aim,
    float krit,
    int regeneratoin,int bogen)
    {
       super(hp, name, schaden);
        this.bogen = bogen;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
     public void newSchaden(){
        setSchaden( bogen + getSchaden());
    }
}