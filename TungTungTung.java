
/**
 * Beschreiben Sie hier die Klasse Bogner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TungTungTung extends Sahur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int MegaKrit;

    /**
     * Konstruktor für Objekte der Klasse Bogner
     */
    public TungTungTung(int hp,
    String name,
    int schaden,
     int pMegaKrit, int schlaeger)
    {
       super(hp, name, schaden,schlaeger);
       MegaKrit = pMegaKrit;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
     public void megaKritBerechnen(){
        setSchaden( MegaKrit*getSchaden());
    }
}