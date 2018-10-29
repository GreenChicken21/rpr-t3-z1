package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){

        Set setMape = mapa.entrySet();

        Iterator it = setMape.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            if(e.getValue().equals(broj))
                return (String) e.getKey();
        }

        return null;
    }


}
