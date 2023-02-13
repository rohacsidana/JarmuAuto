package test;

import model.Auto;

public class JarmuTeszt {

    public static void main(String[] args) {
        JarmuTeszt jarmuTeszt = new JarmuTeszt();
    }

    public JarmuTeszt() {
        //mintaSablonTeszt();
        //haladAutoBeinditasNlkTeszt();
        //haladAutoBeinditassalTeszt();
        haladKerekCsereUtanTeszt();
    }

    private void haladAutoBeinditasNlkTeszt() {
        Auto auto = new Auto();
        boolean vart = false;
        boolean kapott = auto.halad();
        assert kapott == vart : "Beindítás nélkül haladt!";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        boolean vart = true;
        auto.beindit();
        boolean kapott = auto.halad();
        assert kapott == vart : "Az autó nem haladt beindítás után";

    }   

    private void haladKerekCsereUtanTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        auto.halad();
        System.out.println(auto.isDefektes());
        if (auto.isDefektes()) {
            auto.kereketCserel();
            boolean kapott = auto.isDefektes();
            boolean vart = false;
            assert vart == kapott : "Kerékcsere után nem haladt";
        }

    }
    
    private void autoBeinditvaTankoltTeszt(){
        Auto auto = new Auto();
        auto.beindit();
        auto.halad();
        System.out.println(auto.isDefektes());
        boolean kapott = auto.tankol();
        boolean vart = false;
        if (auto.isDefektes() == false) {
            assert kapott == vart : "Az autó be volt indítva tankoláskor" ;
        }        
    }

    private void mintaSablonTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "Nem egyezik a várt és a kapott eredmény";
    }

}
