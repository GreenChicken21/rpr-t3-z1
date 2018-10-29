package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa = new HashMap <>();

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

    public String naSlovo(char s) {
        Set setMape = mapa.entrySet();
        String pov = "";
        int brojac = 1;
        Iterator it = setMape.iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            if(((String)e.getKey()).charAt(0) == s)
                pov = pov + brojac + ". " + e.getKey() + "\n";
        }
        return pov;
    }


}
