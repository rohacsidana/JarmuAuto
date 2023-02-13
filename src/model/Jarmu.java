package model;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megekerkezett;

    public Jarmu() {
        this.uzemanyag = true;
        this.beinditva = false;
        this.megekerkezett = false;
    }

    public void beindit() {
        this.beinditva = true;
    }

    public void leallit() {
        this.beinditva = false;
    }

    public boolean tankol() {
        if (this.beinditva) {
            this.leallit();
        }
        this.uzemanyag = true;
        return true;
    }

    public boolean halad() {
        //érkezzen meg?
        if (this.megekerkezett) {
            this.uzemanyag = false;
            this.leallit();
        }
        return true;
    }
}
