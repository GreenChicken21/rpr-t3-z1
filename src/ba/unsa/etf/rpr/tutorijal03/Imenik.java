package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj){
        return "";
    }


}
