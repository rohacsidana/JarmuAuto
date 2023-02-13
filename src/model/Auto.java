package model;

import java.util.Random;

public class Auto extends Jarmu {

    private boolean defekt;

    public void kereketCserel() {
        this.defekt = false;
    }

    @Override
    public boolean halad() {
        Random rnd = new Random();
        int defektesLesz = rnd.nextInt(4 - 1) + 1;
        if (defektesLesz == 4) {
            this.defekt = true;
        }
        return !this.defekt ? true : false;
    }

}
