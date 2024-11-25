package codeChallenge.gun4.kelimeOyunu;

import java.util.ArrayList;

public class Oyun {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilar

     */
    public static void main(String[] args) {
        ArrayList<Player> oList = new ArrayList<>();
        Player oyuncu1  = new Player();
        oList.add(oyuncu1);

        Player oyuncu2 = new Player();
        oList.add(oyuncu2);


        OyunuBaslat(oyuncu1,oyuncu2);

    }
    public static void OyunuBaslat(Player oyuncu1,Player oyuncu2) {

        oyuncu1.setOyuncu();
        Word.getWord(oyuncu1);
        oyuncu2.setOyuncu();

        boolean continueOrEnd = Word.isAccepted(oyuncu1,oyuncu2);

        while (continueOrEnd){
            System.out.println( oyuncu1.getPlayerId()+ ". oyuncunun puanı " + oyuncu1.getPlayerScore() );
            Word.getWord(oyuncu2);
            continueOrEnd = Word.isAccepted(oyuncu2,oyuncu1);
        }
        Word.endTheGame();


    }
}
