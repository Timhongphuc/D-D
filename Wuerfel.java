
public class Wuerfel {
    
    private int seitenzahl;
    
    public Wuerfel(int pSeitenzahl)
    {
        seitenzahl = pSeitenzahl;
    }
    public int wuerfeln()
    {
       int zufallszahl;
       return zufallszahl = (int)(Math.random()*seitenzahl+1);
    }
}