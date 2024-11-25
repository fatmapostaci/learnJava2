package codeChallenge.gun4.kelimeOyunu;

import java.util.Scanner;

public class Word {
     static Scanner scanf=new Scanner(System.in);

    static boolean isAccepted(Player a, Player b){
        String word=a.word;
        System.out.print(b.playerName + " --> Do you accept the word *"+ word +"* form "+a.playerName+": (YES/NO) ");
        String y_n = scanf.next();
        if (y_n.equalsIgnoreCase("YES") ){
            b.setWordAccepted(true);
            b.setWord(  word  );
            calculateScore(a,b);
        } else{
            b.setWordAccepted(false);
            endTheGame();
        }
        return b.isWordAccepted();
    }
    static void endTheGame(){
        System.out.println("Oyun bitti");
    }
    static void calculateScore(Player a,Player b){
        int wordLenght=wordLenght(b.getWord());
        if (b.isWordAccepted()){
            a.setPlayerScore(wordLenght);
            System.out.println(a.playerName + " " + wordLenght +" puan aldı");
        }
        else {
            b.setPlayerScore(wordLenght);
            System.out.println("Geçersiz kelime!" + b.playerName + " " + wordLenght +" puan aldı");
        }
    }
    private static int wordLenght(String s){
        return s.length();
    }
    static void getWord(Player a){
        System.out.print(a.playerName + " Oyun için bir kelime gir : ");
        a.word =  scanf.next();
        System.out.println(a.playerName +" -->  *" + a.getWord() + "* kelimesini girdi");
        }
    static void printWord(String word){
        System.out.println("word = " + word);
    }
}
