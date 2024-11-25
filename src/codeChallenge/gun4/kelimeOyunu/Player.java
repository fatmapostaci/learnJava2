package codeChallenge.gun4.kelimeOyunu;

import java.util.Scanner;

public class Player {
    int playerId = 000;
    String playerName;
    String word="";
    int playerScore=0;
    boolean acceptWord;

    static Scanner scanner =new Scanner(System.in);
    public void setOyuncu(){
        System.out.print("Oyuncu adı girin: ");
        setPlayerName(scanner.next());
        setPlayerId(+1);

    }
    public int getPlayerId() {
        return playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerScore() {
        return playerScore;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getWord(){
        return word;
    }
    public void setWord (String word){
        this.word += word;
       // this.word = word;
    }
    public void setWordAccepted(boolean acceptWord){
        this.acceptWord = acceptWord;
    }
    public boolean isWordAccepted() {
        return acceptWord;
    }
}
