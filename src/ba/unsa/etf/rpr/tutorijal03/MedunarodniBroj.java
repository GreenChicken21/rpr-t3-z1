package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    String drzava;
    String broj;

    public MedunarodniBroj (String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    public String ispisi(){
        return drzava+broj;
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
