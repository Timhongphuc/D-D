
public class KampfRegel
{
    public KampfRegel()
    {
        
    }
    public void kaempfen(TungTungTung pTungTungTung, Monster pMonster, Wuerfel pWuerfel)
    {
        if(pMonster.getSchaden()*pWuerfel.wuerfeln() < pTungTungTung.getSchaden()*pWuerfel.wuerfeln()){
            pMonster.setHp(pMonster.getHp() - pTungTungTung.getSchaden());
            //System.out.println(pTungTungTung.getName()+" hat gewonnen");
        }
        if(pMonster.getSchaden()*pWuerfel.wuerfeln() > pTungTungTung.getSchaden()*pWuerfel.wuerfeln()){
            pTungTungTung.setHP(pTungTungTung.getHP() - pMonster.getSchaden());
            //System.out.println("Mosnter hat gewonnen");
        }
    }
}