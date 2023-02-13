package model;

import java.util.Random;

public class Auto extends Jarmu {

    private boolean defektes;

    public Auto() {
        this.defektes = false;
    }

    public void kereketCserel() {
        this.defektes = false;
    }

    public boolean isDefektes() {
        return defektes;
    }

    @Override
    public boolean halad() {
        if (this.isBeinditva()) {
            Random rnd = new Random();
            int defektesLesz = rnd.nextInt(4 - 1) + 1;
            if (defektesLesz == 1) {
                this.defektes = true;
            }
        }
        return this.defektes;
    }

}
