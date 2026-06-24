
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main {
    
    public static void main(String[]args){
        TungTungTung pTungTungTung = new TungTungTung(100, "TungTungTung Sahur", 50, 67, 3);
        //Held held2 = new Bogner(100, "Bogenschütze", 20, 5, 40, 5, 30, 10, 15);
        Monster pMonster = new Monster(100, 50, 10);
        Wuerfel pWuerfel = new Wuerfel(12);
        KampfRegel pKampfregel = new KampfRegel();
        
        while(pMonster.getHp() >= 0 && pTungTungTung.getHP() >= 0){
            pKampfregel.kaempfen(pTungTungTung, pMonster, pWuerfel);
        }
        
        if(pMonster.getHp() > pTungTungTung.getHP()){
            System.out.println("Das Monster hat den Kampf gewonnen!");        
        } else if(pMonster.getHp() < pTungTungTung.getHP()) {
            System.out.println("TungTungTung hat gewonnen!");
        }
    }
}