package model;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu() {
        this.uzemanyag = true;
        this.beinditva = false;
        this.megerkezett = false;
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
        this.megerkezett = true;
        this.uzemanyag = false;
        this.leallit();

        return this.megerkezett ? true : false;
    }
}
