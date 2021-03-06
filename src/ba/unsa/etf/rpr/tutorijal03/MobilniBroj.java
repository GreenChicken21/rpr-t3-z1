package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    public String ispisi(){
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
