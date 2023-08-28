package guessthenumber;

import java.util.Random;

public class Player1 {
    //se genereaza un numar random
    /* Trebuie sa cream obiectele pleyer ca sa ne jucam cu ele */

    private String name;//am nevoie de aceasta clasa private pentru a genera Geter si setter

    //Aici definim o clasa
    // daca clasa face ceva, trecem get. in fata
    public int getPlayerGuessNumber(){
        Random rand = new Random(); //se creaza o noua clasa
        return rand.nextInt(1, 3);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
