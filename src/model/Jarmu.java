package model;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu() {
        this.uzemanyag = true;
        this.beinditva = false;
        this.megerkezett = false;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public void beindit() {
        this.beinditva = true;
    }

    public void leallit() {
        this.beinditva = false;
    }

    public boolean tankol() {
        if (!this.isBeinditva()) {
            this.uzemanyag = true;
        }       
        return this.uzemanyag ? true : false;
    }

    public boolean halad() {
        if (this.isBeinditva()) {
            this.megerkezett = true;
            this.uzemanyag = false;
            this.leallit();
        }        
        return this.megerkezett ? true : false;
    }
}
